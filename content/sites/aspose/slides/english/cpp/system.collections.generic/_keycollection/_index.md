---
title: _KeyCollection
second_title: Aspose.Slides for C++ API Reference
description: "Collection of Dictionary's keys. References collection, doesn't copy anything. Objects of this class should only be allocated using System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument."
type: docs
weight: 1
url: /cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


Collection of [Dictionary](../dictionary/)'s keys. References collection, doesn't copy anything. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Methods

| Method | Description |
| --- | --- |
|  [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Initializes collection referencing specified dictionary. |
| void [Add](../ikvcollection/add/)(const T\&) override | Adds item to container. |
|  [BaseKVCollection](../basekvcollection/basekvcollection/)(const typename Dict::Ptr\&) | Creates collection. |
| [iterator](../ienumerable/iterator/) [begin](../ienumerable/begin/)() | Gets iterator pointing to the first element (if any) of the collection. This iterator can't be used to change a referenced object because [GetEnumerator()](../ienumerable/getenumerator/) returns a copy-object of T. |
| [const_iterator](../ienumerable/const_iterator/) [begin](../ienumerable/begin/)() const | Gets iterator pointing to the first element (if any) of the const-qualified instance of the collection. |
| [const_iterator](../ienumerable/const_iterator/) [cbegin](../ienumerable/cbegin/)() const | Gets iterator pointing to the first const-qualified element (if any) of the collection. |
| [const_iterator](../ienumerable/const_iterator/) [cend](../ienumerable/cend/)() const | Gets iterator pointing right after the last const-qualified element (if any) of the collection. |
| void [Clear](../ikvcollection/clear/)() override | Deletes all elements from container. |
| **bool** [Contains](./contains/)(const [TKey](./tkey/)\&) const override | Checks if item is present in container. |
| void [CopyTo](../basekvcollection/copyto/)([ArrayPtr](../../system/arrayptr/)\<KV\>, int) override | Copies data to existing array elements. |
| [iterator](../ienumerable/iterator/) [end](../ienumerable/end/)() | Gets iterator pointing right after the last element (if any) of the collection. This iterator can't be used to change a referenced object because [GetEnumerator()](../ienumerable/getenumerator/) returns a copy-object of T. |
| [const_iterator](../ienumerable/const_iterator/) [end](../ienumerable/end/)() const | Gets iterator pointing right after the last element (if any) of the const-qualified instance of the collection. |
| virtual **bool** [Equals](../../system/object/equals/)([ptr](../../system/object/ptr/)) | Compares objects using C# [Object.Equals](../../system/object/equals/) semantics. |
| static std::enable_if\<[IsSmartPtr](../../system/issmartptr/)\<T1\>::value\&&[IsSmartPtr](../../system/issmartptr/)\<T2\>::value, **bool**\>::type [Equals](../../system/object/equals/)(T1 const\&, T2 const\&) | Compares reference type objects in C# style. |
| static std::enable_if<\![IsSmartPtr](../../system/issmartptr/)\<T1\>::value\&&\![IsSmartPtr](../../system/issmartptr/)\<T2\>::value, **bool**\>::type [Equals](../../system/object/equals/)(T1 const\&, T2 const\&) | Compares value type objects in C# style. |
| static **bool** [Equals](../../system/object/equals/)(**float** const\&, **float** const\&) | Emulates C#-style floating point comparison where two NaNs are considered equal even though according to IEC 60559:1989 NaN is not equal to any value, including NaN. |
| static **bool** [Equals](../../system/object/equals/)(**double** const\&, **double** const\&) | Emulates C#-style floating point comparison where two NaNs are considered equal even though according to IEC 60559:1989 NaN is not equal to any value, including NaN. |
| virtual **bool** [FastCast](../../system/object/fastcast/)(const Details::FastRttiBase\&, void **) const | For internal purposes only. |
| int [get_Count](../basekvcollection/get_count/)() const override | Gets number of elements. |
| **bool** [get_IsFixedSize](../ilist/get_isfixedsize/)() | Checks whether the collection is of fixed size. |
| **bool** [get_IsReadOnly](../ikvcollection/get_isreadonly/)() const override | Checks if container is read only. |
| [SharedPtr](../../system/sharedptr/)\<[Object](../../system/object/)\> [get_SyncRoot](../icollection/get_syncroot/)() const | Gets the object the collection is being synchronized through. |
| Detail::SmartPtrCounter * [GetCounter](../../system/object/getcounter/)() | Gets reference counter data structure associated with the object. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerator](../ienumerator/)\<[TKey](./tkey/)\>\> [GetEnumerator](./getenumerator/)() override | Gets enumerator iterating through keys. |
| virtual **int32_t** [GetHashCode](../../system/object/gethashcode/)() const | Analog of C# [Object.GetHashCode()](../../system/object/gethashcode/) method. Enables hashing of custom objects. |
| virtual const [TypeInfo](../../system/typeinfo/)\& [GetType](../../system/object/gettype/)() const | Gets actual type of object. Analog of C# [System.Object.GetType()](../../system/object/gettype/) call. |
|  [ICollection](../icollection/icollection/)() | Default constructor. |
|  [ICollection](../icollection/icollection/)(const [ICollection](../icollection/)\&) | Copy constructor. |
|  [ICollection](../icollection/icollection/)([ICollection](../icollection/)\&&) | Move constructor. |
| [TKey](./tkey/) [idx_get](./idx_get/)(int) const override | Implements [IList](../ilist/) method. Not supported. |
| void [idx_set](../ikvcollection/idx_set/)(int, T) override | Setter function. |
| int [IndexOf](../ikvcollection/indexof/)(const T\&) const override | Gets index of item in container. |
| void [Insert](../ikvcollection/insert/)(int, const T\&) override | Inserts item at specified position. |
| virtual **bool** [Is](../../system/object/is/)(const [TypeInfo](../../system/typeinfo/)\&) const | Check if object represents an instance of type described by targetType. Analog of C# 'is' operator. |
| **bool** [LINQ_All](../ienumerable/linq_all/)(std::function\<**bool**(T)>) | Determines whether all elements of a sequence satisfy a condition. |
| **bool** [LINQ_Any](../ienumerable/linq_any/)() | Determines whether a sequence contains any elements. |
| **bool** [LINQ_Any](../ienumerable/linq_any/)(std::function\<**bool**(T)>) | Determines whether any element of a sequence exists or satisfies a condition. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<ResultType\>\> [LINQ_Cast](../ienumerable/linq_cast/)() | Casts the elements to the specified type. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Result\>\> [LINQ_Cast](../ienumerable/linq_cast/)() |  |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<T\>\> [LINQ_Concat](../ienumerable/linq_concat/)([SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<T\>\>) | Concatenates two sequences. |
| **bool** [LINQ_Contains](../ienumerable/linq_contains/)(T) | Determines if a sequence contains a specified value. |
| int [LINQ_Count](../ienumerable/linq_count/)() | Returns the number of elements in the sequence (calculated via direct counting). |
| int [LINQ_Count](../ienumerable/linq_count/)(const [Func](../../system/func/)\<T, **bool**\>\&) | Returns the number of elements in the sequence that satisfy the specified condition. |
| T [LINQ_ElementAt](../ienumerable/linq_elementat/)(int) | Returns the element at a specified index in a sequence. |
| T [LINQ_First](../ienumerable/linq_first/)() | Returns the first element of a sequence. |
| T [LINQ_First](../ienumerable/linq_first/)(const [Func](../../system/func/)\<T, **bool**\>\&) | Returns the first element of a sequence that satisfy the specified condition. |
| T [LINQ_FirstOrDefault](../ienumerable/linq_firstordefault/)() | Returns the first element of a sequence, or a default value if the sequence is empty. |
| T [LINQ_FirstOrDefault](../ienumerable/linq_firstordefault/)(std::function\<**bool**(T)>) | Returns the first element of the sequence that satisfies a condition or a default value if no such element is found. |
| [System::SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<[System::SharedPtr](../../system/sharedptr/)\<[System::Linq::IGrouping](../../system.linq/igrouping/)\<Key, T\>\>\>\> [LINQ_GroupBy](../ienumerable/linq_groupby/)([System::Func](../../system/func/)\<T, Key\>) | Groups the elements of a sequence. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<[SharedPtr](../../system/sharedptr/)\<[System::Linq::IGrouping](../../system.linq/igrouping/)\<Key, Source\>\>\>\> [LINQ_GroupBy](../ienumerable/linq_groupby/)([System::Func](../../system/func/)\<Source, Key\>) |  |
| T [LINQ_Last](../ienumerable/linq_last/)() | Returns the last element of a sequence. |
| T [LINQ_LastOrDefault](../ienumerable/linq_lastordefault/)() | Returns the last element of a sequence, or a default value if the sequence is empty. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<ResultType\>\> [LINQ_OfType](../ienumerable/linq_oftype/)() | Filters the elements of the sequence based on the specified type. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Result\>\> [LINQ_OfType](../ienumerable/linq_oftype/)() |  |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<T\>\> [LINQ_OrderBy](../ienumerable/linq_orderby/)(const [Func](../../system/func/)\<T, Key\>\&) | Sorts the elements of a sequence in ascending order according to the key values selected by keySelector. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Source\>\> [LINQ_OrderBy](../ienumerable/linq_orderby/)(const [Func](../../system/func/)\<Source, Key\>\&) |  |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<T\>\> [LINQ_OrderByDescending](../ienumerable/linq_orderbydescending/)(const [Func](../../system/func/)\<T, Key\>\&) | Sorts the elements of a sequence in descending order according to the key values selected by keySelector. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Source\>\> [LINQ_OrderByDescending](../ienumerable/linq_orderbydescending/)(const [Func](../../system/func/)\<Source, Key\>\&) |  |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<ResultType\>\> [LINQ_Select](../ienumerable/linq_select/)(const [Func](../../system/func/)\<T, ResultType\>\&) | Transforms elements of a sequence. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<ResultType\>\> [LINQ_Select](../ienumerable/linq_select/)(const [Func](../../system/func/)\<T, **int32_t**, ResultType\>\&) | Transforms each element of a sequence into a new form by incorporating the element's index. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Result\>\> [LINQ_Select](../ienumerable/linq_select/)(const [Func](../../system/func/)\<Source, Result\>\&) |  |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Result\>\> [LINQ_Select](../ienumerable/linq_select/)(const [Func](../../system/func/)\<Source, **int32_t**, Result\>\&) |  |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<ResultType\>\> [LINQ_SelectMany](../ienumerable/linq_selectmany/)(const [Func](../../system/func/)\<T, [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<ResultType\>\>\>\&) | Projects each element of a sequence and combines the resulting sequences into one sequence. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Result\>\> [LINQ_SelectMany](../ienumerable/linq_selectmany/)(const [Func](../../system/func/)\<Source, [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<Result\>\>\>\&) |  |
| [System::ArrayPtr](../../system/arrayptr/)\<T\> [LINQ_ToArray](../ienumerable/linq_toarray/)() | Creates an array from a sequence. |
| [SharedPtr](../../system/sharedptr/)\<[List](../list/)\<T\>\> [LINQ_ToList](../ienumerable/linq_tolist/)() | Creates a List<T> from a sequence. |
| [SharedPtr](../../system/sharedptr/)\<[IEnumerable](../ienumerable/)\<T\>\> [LINQ_Where](../ienumerable/linq_where/)(std::function\<**bool**(T)>) | Filters a sequence based on the specified predicate. |
| void [Lock](../../system/object/lock/)() | Implements C# lock() statement locking. Call directly or use [LockContext](../../system/lockcontext/) sentry object. |
| virtual [ptr](../../system/object/ptr/) [MemberwiseClone](../../system/object/memberwiseclone/)() const | Analog of C# [Object.MemberwiseClone()](../../system/object/memberwiseclone/) method. Enables cloning custom types. |
|  [Object](../../system/object/object/)() | Creates object. Initializes all internal data structures. |
|  [Object](../../system/object/object/)([Object](../../system/object/) const\&) | Copy constructor. Doesn't copy anything, really, just initializes new object and enables copy constructing subclasses. |
| [ICollection](../icollection/)\& [operator=](../icollection/operator_equal/)([ICollection](../icollection/)\&&) | Move assignment operator. |
| [ICollection](../icollection/)\& [operator=](../icollection/operator_equal/)(const [ICollection](../icollection/)\&) | Move assignment operator. |
| [Object](../../system/object/)\& [operator=](../../system/object/operator_equal/)([Object](../../system/object/) const\&) | Assignment operator. Doesn't copy anything, really, just initializes new object and enables copy constructing subclasses. |
| static **bool** [ReferenceEquals](../../system/object/referenceequals/)([ptr](../../system/object/ptr/) const\&, [ptr](../../system/object/ptr/) const\&) | Compares objects by reference. |
| static std::enable_if<\![IsSmartPtr](../../system/issmartptr/)\<T\>::value, **bool**\>::type [ReferenceEquals](../../system/object/referenceequals/)(T const\&, T const\&) | Compares objects by reference. |
| static std::enable_if<\![IsSmartPtr](../../system/issmartptr/)\<T\>::value, **bool**\>::type [ReferenceEquals](../../system/object/referenceequals/)(T const\&, std::nullptr_t) | Reference-compares value type object with nullptr. |
| **bool** [ReferenceEquals](../../system/object/referenceequals/)([String](../../system/string/) const\&, std::nullptr_t) | Specialization of [Object::ReferenceEquals](../../system/object/referenceequals/) for case of string and nullptr. |
| **bool** [ReferenceEquals](../../system/object/referenceequals/)([String](../../system/string/) const\&, [String](../../system/string/) const\&) | Specialization of [Object::ReferenceEquals](../../system/object/referenceequals/) for case of strings. |
| **bool** [Remove](../ikvcollection/remove/)(const T\&) override | Removes item from container. |
| void [RemoveAt](../ikvcollection/removeat/)(int) override | Removes item at specified position. |
| int [RemovedSharedRefs](../../system/object/removedsharedrefs/)(int) | Decreases shared reference count by specified value. |
| void [SetTemplateWeakPtr](../basekvcollection/settemplateweakptr/)(**uint32_t**) override | Enables compilation, but doesn't actually do anything as this structure doesn't own data. |
| int [SharedCount](../../system/object/sharedcount/)() const | Gets current value of shared reference counter. |
| [Object](../../system/object/) * [SharedRefAdded](../../system/object/sharedrefadded/)() | Increments shared reference count. Shouldn't be called directly; instead, use smart pointers or ThisProtector. |
| int [SharedRefRemovedSafe](../../system/object/sharedrefremovedsafe/)() | Decrements and returns shared reference count. Shouldn't be called directly; instead, use smart pointers or ThisProtector. |
| virtual [String](../../system/string/) [ToString](../../system/object/tostring/)() const | Analog of C# [Object.ToString()](../../system/object/tostring/) method. Enables converting custom objects to string. |
| static const [TypeInfo](../../system/typeinfo/)\& [Type](../../system/object/type/)() | Implements C# typeof([System.Object](../../system/object/)) construct. |
| void [Unlock](../../system/object/unlock/)() | Implements C# lock() statement unlocking. Call directly or use [LockContext](../../system/lockcontext/) sentry object. |
| System::Details::VirtualizedIteratorBase\<[TKey](./tkey/)\> * [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gets the implementation of begin const iterator for the current container. |
| System::Details::VirtualizedIteratorBase\<[TKey](./tkey/)\> * [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gets the implementation of begin iterator for the current container. |
| System::Details::VirtualizedIteratorBase\<[TKey](./tkey/)\> * [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gets the implementation of end const iterator for the current container. |
| System::Details::VirtualizedIteratorBase\<[TKey](./tkey/)\> * [virtualizeEndIterator](./virtualizeenditerator/)() override | Gets the implementation of end iterator for the current container. |
| Detail::SmartPtrCounter * [WeakRefAdded](../../system/object/weakrefadded/)() | Increments weak reference count. Shouldn't be called directly; instead, use smart pointers or ThisProtector. |
| void [WeakRefRemoved](../../system/object/weakrefremoved/)() | Decrements weak reference count. Shouldn't be called directly; instead, use smart pointers or ThisProtector. |
| virtual  [~ICollection](../icollection/~icollection/)() | Destructor. |
| virtual  [~Object](../../system/object/~object/)() | Destroys object. Frees all internal data structures. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [TKey](./tkey/) | Key type. |

## See Also

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Slides](../../)