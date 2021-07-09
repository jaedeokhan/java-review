### 컬렉션 클래스 정리 & 요약

- ArrayList, Vector는 Object[]을 가지고 여기에 객체를 저장한다. - 배열 기반
   - Stack : LIFO(Last In First Out), Stack은 Vector를 상속받는다.
   - LinkedList : 배열의 단점인 **추가**와 **삭제**에 불리한 것을 개선한 것이다. => 연결기반!!
      - Queue : FIFO(First In First Out, Queue는 LinkedList를 기준으로 만들었다.'
      - TreeMap : 트리 구조로 검색 범위검색, 정렬기능 향상(이진트리)
- HashMap<Key, Value>, Hashtable : 배열과 링크드 리스트를 결합해서  **검색기능 향상을** 위한 자료구조이다.
   - LinekedHashMap : Map은 순서 유지가 되지 않는데 **순서 유지를 필요로 할 때 사용**
- HashSet 
   - LinkedHashSet : Map과 Set은 순서 유지를 하지 않는데, **Set인데 순서 유지를 할 때 사용!!**
- TreeSet
- Properties : HashMap의 변형으로 만들어진 것, **<Key와 Value>를 <String, String>**으로만 저장이 가능하다 => 파일에 읽기와 쓰기가 용이
