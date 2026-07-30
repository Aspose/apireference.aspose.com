---
title: "System::Array 类"
linktitle: "数组"
second_title: "Aspose.Font 适用于 C++"
description: "System::Array 类。表示数组数据结构的类。此类的对象只能使用 System::MakeArray() 和 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 200
url: /zh/cpp/system/array/
---
## Array class


表示数组数据结构的类。此类的对象只能使用 [System::MakeArray()](../makearray/) 和 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 数组元素的类型 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const T\&) override | 不支持，因为当前对象表示的数组是只读的。 |
| [Array](./array/)() | 构造一个空数组。 |
| [Array](./array/)(int, const T\&) | 填充构造函数。 |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | 填充构造函数。 |
| [Array](./array/)(int, const T) | 填充构造函数。 |
| [Array](./array/)(vector_t\&&) | 移动构造函数。 |
| [Array](./array/)(const vector_t\&) | 拷贝构造函数。 |
| [Array](./array/)(const std::vector\<Q\>\&) | 构造一个 [Array](./) 对象，并使用从 std::vector 对象复制的值填充该对象，该向量的值类型与 **T** 相同，但不同于 **[UnderlyingType](./underlyingtype/)**。 |
| [Array](./array/)(std::vector\<Q\>\&&) | 构造一个 [Array](./) 对象，并使用从 std::vector 对象移动的值填充该对象，该向量的值类型与 **T** 相同，但不同于 **[UnderlyingType](./underlyingtype/)**。 |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | 构造一个 [Array](./) 对象，并使用指定的初始化列表中的 **[UnderlyingType](./underlyingtype/)** 类型元素填充。 |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | 构造一个 [Array](./) 对象，并使用指定数组中包含的 **[UnderlyingType](./underlyingtype/)** 类型元素填充。 |
| [Array](./array/)(std::initializer_list\<bool\>, int) | 构造一个 [Array](./) 对象，并使用指定的初始化列表中 bool 类型的元素填充。 |
| [begin](./begin/)() | 返回指向容器第一个元素的迭代器。如果容器为空，返回的迭代器将等于 [end()](./end/)。 |
| [begin](./begin/)() const | 返回指向 const 限定容器第一个元素的迭代器。如果容器为空，返回的迭代器将等于 [end()](./end/)。 |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | 在已排序的数组中执行二分查找。 |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | 未实现。 |
| [cbegin](./cbegin/)() const | 返回指向容器第一个 const 限定元素的迭代器。如果容器为空，返回的迭代器将等于 [cend()](./cend/)。 |
| [cend](./cend/)() const | 返回指向容器最后一个元素之后的元素的迭代器。该元素充当占位符；尝试访问它会导致未定义行为。 |
| [Clear](./clear/)() override | 不支持，因为当前对象表示的数组是只读的。 |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | 将指定数组中从 **startIndex** 索引开始的 **count** 个值替换为默认值。 |
| [Clone](./clone/)() | 克隆数组。 |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 从指定的源开始，复制一段元素自 [System.Array](./)。 |
| [Contains](./contains/)(const T\&) const override | 确定指定的项是否在数组中。 |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | 构造一个新的 [Array](./) 对象，并使用指定的转换委托将指定数组的元素转换为 **OutputType** 类型后填充它。 |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | 构造一个新的 [Array](./) 对象，并使用指定的转换函数对象将指定数组的元素转换为 **OutputType** 类型后填充它。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | 将指定数量的元素从源数组复制到目标数组。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | 将指定数量的元素从源数组视图复制到目标数组。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | 将指定数量的元素从源数组复制到目标数组视图。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | 将指定数量的元素从源数组视图复制到目标数组视图。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | 将指定数量的元素从栈上的源数组复制到目标数组。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | 将指定数量的元素从源数组复制到栈上的目标数组。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | 将指定数量的元素从栈上的源数组复制到栈上的目标数组。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 将指定数量的元素从源数组的指定索引开始复制到目标数组的指定位置。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 将指定数量的元素从源数组视图的指定索引开始复制到目标数组的指定位置。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | 将指定数量的元素从源数组的指定索引开始复制到目标数组视图的指定位置。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | 将指定数量的元素从源数组视图的指定索引开始复制到目标数组视图的指定位置。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 将指定数量的元素从栈上的源数组的指定索引开始复制到目标数组的指定位置。 |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | 将指定数量的元素从源数组的指定索引开始复制到栈上的目标数组的指定位置。 |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | 将指定数量的元素从栈上的源数组的指定索引开始复制到栈上的目标数组的指定位置。 |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | 将指定数量的元素从源数组视图的指定索引开始复制到栈上的目标数组的指定位置。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 将当前数组的所有元素复制到指定的目标数组。元素从由 arrayIndex 参数指定的索引开始插入到目标数组中。 |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | 将当前数组的所有元素复制到指定的目标数组。元素从由 dstIndex 参数指定的索引开始插入到目标数组中。 |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | 将当前数组的所有元素复制到指定的目标数组视图。元素从由 dstIndex 参数指定的索引开始插入到目标数组视图中。 |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | 将指定数量的元素从当前数组的指定位置开始复制到指定的目标数组。元素从由 dstIndex 参数指定的索引开始插入到目标数组中。 |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | 从当前数组的指定位置复制指定数量的元素到指定的目标数组视图。元素将按照 dstIndex 参数指定的索引插入到目标数组视图中。 |
| [Count](./count/)() const | 返回一个表示数组所有维度中元素总数的数字。 |
| [crbegin](./crbegin/)() const | 返回指向反向容器第一个元素的逆向迭代器。它对应于未反转容器的最后一个元素。如果容器为空，返回的迭代器等于 [crend()](./crend/)。 |
| [crend](./crend/)() const | 返回指向反向容器最后一个元素之后的元素的逆向迭代器。它对应于未反转容器的第一个元素之前的元素。该元素充当占位符，尝试访问它会导致未定义行为。 |
| [data](./data/)() | 返回用于存储数组元素的内部数据结构的引用。 |
| [data](./data/)() const | 返回用于存储数组元素的内部数据结构的常量引用。 |
| [data_ptr](./data_ptr/)() | 返回指向存储数组元素的内存缓冲区起始位置的原始指针。 |
| [data_ptr](./data_ptr/)() const | 返回指向存储数组元素的内存缓冲区起始位置的常量原始指针。 |
| [end](./end/)() | 返回指向容器最后一个元素之后的元素的迭代器。该元素充当占位符；尝试访问它会导致未定义行为。 |
| [end](./end/)() const | 返回指向 const 限定容器最后一个元素之后的元素的迭代器。该元素充当占位符；尝试访问它会导致未定义行为。 |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | 确定指定的 [Array](./) 对象是否包含满足指定谓词要求的元素。 |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 在指定的数组中搜索满足指定谓词条件的第一个元素。 |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 检索所有符合指定谓词定义的条件的元素。 |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 在指定的数组中搜索满足指定谓词条件的第一个元素。 |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | 对指定数组的每个元素执行指定的操作。 |
| [get_Count](./get_count/)() const override | 返回数组的大小。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | 指示数组是否为只读。 |
| [get_Length](./get_length/)() const | 返回表示数组所有维度中元素总数的 32 位整数。 |
| [get_LongLength](./get_longlength/)() const | 返回表示数组所有维度中元素总数的 64 位整数。 |
| [get_Rank](./get_rank/)() const | 未实现。 |
| [GetEnumerator](./getenumerator/)() override | 返回指向 [Enumerator](./enumerator/) 对象的指针，该对象为当前对象表示的数组元素提供 IEnumerator 接口。 |
| [GetLength](./getlength/)(int) | 返回指定维度中的元素数量。 |
| [GetLongLength](./getlonglength/)(int) | 以 64 位整数返回指定维度中的元素数量。 |
| [GetLowerBound](./getlowerbound/)(int) const | 返回指定维度的下界。 |
| [GetSizeTLength](./getsizetlength/)() const | 返回一个 std::size_t 变量，表示数组所有维度中元素的总数。 |
| [GetUpperBound](./getupperbound/)(int) | 返回指定维度的上界。 |
| [idx_get](./idx_get/)(int) const override | 返回指定索引处的项。 |
| [idx_set](./idx_set/)(int, T) override | 将指定值设置为数组在指定索引处的项。 |
| [IndexOf](./indexof/)(const T\&) const override | 确定数组中指定项首次出现的索引。 |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | 确定数组中指定项首次出现的索引。 |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | 确定数组中指定项首次出现的索引，搜索起始于指定的索引。 |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | 确定在由起始索引和范围内元素数量指定的数组项范围中，指定项首次出现的索引。 |
| [Init](./init/)(const T) | 用指定数组中的值填充当前对象表示的数组。 |
| [Initialize](./initialize/)() | 用类型 **T** 的默认构造对象填充数组。 |
| [Insert](./insert/)(int, const T\&) override | 不支持，因为当前对象表示的数组是只读的。 |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | 确定在由起始索引和范围内元素数量指定的数组项范围中，指定项最后一次出现的索引。 |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | 确定从指定索引开始的数组中，指定项最后一次出现的索引。 |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | 确定数组中指定项最后一次出现的索引。 |
| [Max](./max/)() const | 使用 [operator<()](../operator_/) 比较元素，查找数组中最大的元素。 |
| [Min](./min/)() const | 使用 [operator<()](../operator_/) 比较元素，查找数组中最小的元素。 |
| [operator[]](./operator[]/)(int) | 返回指定索引处的项。 |
| [operator[]](./operator[]/)(int) const | 返回指定索引处的项。 |
| [rbegin](./rbegin/)() | 返回指向反转容器中第一个元素的反向迭代器。它对应于未反转容器的最后一个元素。如果容器为空，返回的迭代器等于 [rend()](./rend/)。 |
| [rbegin](./rbegin/)() const | 返回指向反转容器中第一个元素的反向迭代器。它对应于未反转容器的最后一个元素。如果容器为空，返回的迭代器等于 [rend()](./rend/)。 |
| [Remove](./remove/)(const T\&) override | 不支持，因为当前对象表示的数组是只读的。 |
| [RemoveAt](./removeat/)(int) override | 不支持，因为当前对象表示的数组是只读的。 |
| [rend](./rend/)() | 返回指向反向容器最后一个元素之后的元素的逆向迭代器。它对应于未反转容器的第一个元素之前的元素。该元素充当占位符，尝试访问它会导致未定义行为。 |
| [rend](./rend/)() const | 返回指向反向容器最后一个元素之后的元素的逆向迭代器。它对应于未反转容器的第一个元素之前的元素。该元素充当占位符，尝试访问它会导致未定义行为。 |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | 将指定数组的大小更改为指定值，或创建具有指定大小的新数组。 |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | 反转指定数组中的元素。 |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | 反转指定数组中一段范围的元素。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 使数组将存储的指针视为弱引用（如果适用）。 |
| [SetValue](./setvalue/)(const T\&, int) | 设置指定索引处元素的值。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | 使用默认比较器对指定数组中的元素进行排序。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | 使用默认比较器对指定数组中一段范围的元素进行排序。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | 使用指定的比较器对指定数组中的元素进行排序。 |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | 未实现。 |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | 对两个数组进行排序，一个包含键，另一个包含相应的项，排序依据包含键的数组的值，键数组的元素使用 operator< 进行比较。 |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | 对两个数组进行排序，一个包含键，另一个包含相应的项，排序依据包含键的数组的值，键数组的元素使用默认比较器进行比较。 |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 确定指定数组中的所有元素是否满足指定谓词定义的条件。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | 常量反向迭代器类型。 |
| [EnumerablePtr](./enumerableptr/) | 一个指向包含类型为 **T** 的元素的 IEnumerable 对象的共享指针类型的别名。 |
| [EnumeratorPtr](./enumeratorptr/) | 一个指向包含类型为 **T** 的元素的 IEnumerator 对象的共享指针类型的别名。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [reverse_iterator](./reverse_iterator/) | 反向迭代器类型。 |
| [UnderlyingType](./underlyingtype/) | 用于表示数组中每个元素的类型的别名。 |
| [ValueType](./valuetype/) | 数组元素类型的别名。 |
## 备注



```cpp
#include <system/array.h>
#include <system/smart_ptr.h>

using namespace System;

void Print(const SmartPtr<Array<int32_t>> &arrayPtr)
{
  for (auto item: arrayPtr)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 创建并填充数组。
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // 打印数组项。
  Print(arrayPtr);

  // 按升序对数组项进行排序。
  Array<int32_t>::Sort(arrayPtr);

  // 打印数组项。
  Print(arrayPtr);

  // 打印数组项的计数。
  std::cout << arrayPtr->get_Length() << std::endl;

  // 打印等于 4 的项的索引。
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // 调整数组大小。
  Array<int32_t>::Resize(arrayPtr, 3);

  // 打印数组项。
  Print(arrayPtr);

  return 0;
}
/*
This code example produces the following output:
5 4 3 2 1
1 2 3 4 5
5
3
1 2 3
*/
```

## 另见

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
