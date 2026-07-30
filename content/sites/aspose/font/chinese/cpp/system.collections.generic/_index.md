---
title: "System::Collections::Generic 命名空间"
linktitle: "System::Collections::Generic"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Collections::Generic 命名空间。"
type: docs
weight: 2800
url: /zh/cpp/system.collections.generic/
---



## 类

| 类 | 描述 |
| --- | --- |
| [_KeyCollection](./_keycollection/) | [Dictionary](./dictionary/) 键的集合。引用集合，不进行复制。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [_KeyList](./_keylist/) | 实现字典键的列表。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [_ValueCollection](./_valuecollection/) | [Dictionary](./dictionary/) 值的集合。引用集合，不进行复制。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [_ValueList](./_valuelist/) | 实现字典值的列表。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BaseDictionary](./basedictionary/) | 实现各种类似字典的数据结构（例如 [Dictionary](./dictionary/)、[SortedDictionary](./sorteddictionary/)）的通用代码。除在定义容器时继承外，不应直接使用。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BaseEnumerator](./baseenumerator/) | [Enumerator](./baseset/) 定义，用于将 STL 风格的类型包装为 C# 风格的用法。除检查顺序迭代器是否存在外，不对容器结构做任何断言。使用 begin() 和 end() 函数。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BaseKVCollection](./basekvcollection/) | 保存键或值集合的通用代码。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [BaseSet](./baseset/) |  |
| [Comparer](./comparer/) | 为 [System.Collections.Generic.IComparer](./icomparer/) 泛型接口的实现提供基类。 |
| [DefaultComparer](./defaultcomparer/) | 默认比较器类。使用 operator < 和 operator == 来比较值。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [Dictionary](./dictionary/) | [Dictionary](./dictionary/) 类的前向声明。 |
| [DictionaryIterator](./dictionaryiterator/) | [Dictionary](./dictionary/) 迭代器，提供 [KeyValuePair](./keyvaluepair/) 记法。 |
| [DictionaryPtr](./dictionaryptr/) | [Dictionary](./dictionary/) 指针类，带有运算符重载。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用的方式传递给函数。 |
| [EnumerableExt](./enumerableext/) |  |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/) | 包装预先创建的枚举器并将所有调用重定向到其中的迭代器。 |
| [HashDictionary](./hashdictionary/) | [HashDictionary](./hashdictionary/) 类的存根（当前未实现）。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [HashSet](./hashset/) | [HashSet](./hashset/) 类的前向声明。 |
| [HashSetPtr](./hashsetptr/) | 用于保持 [HashSet](./hashset/) 引用的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用的方式传递给函数。 |
| [ICollection](./icollection/) | 元素集合的接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [IComparer](./icomparer/) | 在大于-等于-小于意义上比较两个对象的接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [IDictionary](./idictionary/) | 类似字典容器的接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [IEnumerable](./ienumerable/) | 提供包含元素枚举器的对象接口。 |
| [IEnumerator](./ienumerator/) | 可用于遍历某些元素的枚举器接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 操作符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [IEqualityComparer](./iequalitycomparer/) | 提供比较两个对象相等性的手段的接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [IKVCollection](./ikvcollection/) | 包含字典类容器的键或值的容器接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [IList](./ilist/) | 元素索引容器的接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [ISet](./iset/) | 包含唯一元素集合的集合接口。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [KeyIterator](./keyiterator/) | [Dictionary](./dictionary/) 迭代器，提供键访问。 |
| [KeyValuePair](./keyvaluepair/) | 键和值的对。此类型应在栈上分配，并以值或引用方式传递给函数。切勿使用 [System::SmartPtr](../system/smartptr/) 类来管理此类型的对象。 |
| [KVPairIterator](./kvpairiterator/) | 适配迭代器，将 std::pair 包装为 [Dictionary](./dictionary/) 所期望的 KVPair。 |
| [LinkedList](./linkedlist/) | [LinkedList](./linkedlist/) 前向声明。 |
| [LinkedListNode](./linkedlistnode/) | 链表节点。实现了对 std::list 迭代器的包装，该迭代器被链表包装。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [List](./list/) | [List](./list/) 前向声明。 |
| [ListExt](./listext/) | 通用 [List](./list/) 类，实现了 [IListWrapper](../system.collections/ilistwrapper/) 接口 |
| [ListPtr](./listptr/) | [List](./list/) 指针，带访问运算符。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。 |
| [Queue](./queue/) | [Queue](./queue/) 类前向声明。 |
| [QueuePtr](./queueptr/) | [Queue](./queue/) 指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。 |
| [ReverseEnumerator](./reverseenumerator/) | [Enumerator](./baseset/) 用于逆向遍历容器。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [SimpleEnumerator](./simpleenumerator/) | 用于直接使用 rbegin() 和 rend() 函数持有元素的简单容器的迭代器类。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [SortedDictionary](./sorteddictionary/) | 已排序字典类型前向声明。 |
| [SortedDictionaryPtr](./sorteddictionaryptr/) | 已排序字典指针，带访问运算符。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。 |
| [SortedList](./sortedlist/) | 包装 FlatMap 结构的已排序列表。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针作为参数传递给函数。 |
| [SortedListHelper](./sortedlisthelper/) | 此辅助类用于屏蔽来自 [IDictionary](./idictionary/) 接口的虚函数 get_Keys、get_Values，并将其替换为返回类型不同的函数。 |
| [SortedSet](./sortedset/) | [SortedSet](./sortedset/) 类的前向声明。 |
| [SortedSetPtr](./sortedsetptr/) | 用于保存 [SortedSet](./sortedset/) 引用的指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。 |
| [Stack](./stack/) | [Stack](./stack/) 类前向声明。 |
| [StackPtr](./stackptr/) | [Stack](./stack/) 指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值或 const 引用方式传递给函数。 |
| [ValueIterator](./valueiterator/) | [Dictionary](./dictionary/) 迭代器，提供值访问。 |
## Functions

| 函数 | 描述 |
| --- | --- |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| _net_binnary_search | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
