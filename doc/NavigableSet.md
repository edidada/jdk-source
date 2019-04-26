# NavigableSet

公共接口NavigableSet <E> 
扩展了SortedSet <E>
一个SortedSet扩展了的导航方法报告对于给定的搜索目标最接近的匹配。方法lower， floor，ceiling，和higher返回元件比大于比大于给定的元件分别更少，小于或等于，大于或等于，和更大，返回null如果不存在这样的元件。NavigableSet可以按升序或降序访问和遍历A. 该descendingSet方法返回集合的视图，其中所有关系和方向方法的感知都被反转。升序操作和视图的性能可能比下降操作和视图的性能更快。此接口还定义了方法， pollFirst并pollLast返回和删除最低和最高元素（如果存在），否则返回null。方法subSet，headSet和tailSet类似命名SortedSet方法的不同之处在于接受描述下限和上限是包含还是排除的其他参数。any的子集NavigableSet必须实现NavigableSet接口。
在允许null元素的实现中，导航方法的返回值可能是不明确的。但是，即使在这种情况下，也可以通过检查来消除结果的歧义 contains(null)。为了避免这样的问题，鼓励这个接口的实现来不容许的插入 null元件。（请注意，排序的Comparable元素集本质上不允许null。）

方法 subSet(E, E)， headSet(E)以及 tailSet(E) 被指定为返回SortedSet到允许现有的实现SortedSet能相容地改进来实现NavigableSet，但鼓励扩展和该接口的实现重写这些方法返回 NavigableSet。
