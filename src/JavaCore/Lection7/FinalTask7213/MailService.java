package JavaCore.Lection7.FinalTask7213;

import java.util.*;
import java.util.function.Consumer;

public class MailService <T> implements Consumer<Sendable<T>> {
    Map<String, List<T>> map;

    public MailService() {
        map = new HashMap<>() {
            @Override
            public List<T> get(Object key) {
                return super.get(key) == null ? new ArrayList<>() : super.get(key);
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return map;
    }
    public List<T> get(String key) {
        return map.get(key);
    }

    @Override
    public void accept(Sendable<T> t) {
        map.computeIfAbsent(t.getTo(), k -> new ArrayList<>()).add(t.getContent());
    }
}
