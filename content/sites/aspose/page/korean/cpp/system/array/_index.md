---
title: "System::Array 클래스"
linktitle: "Array"
second_title: "C++용 Aspose.Page"
description: "System::Array 클래스. 배열 데이터 구조를 나타내는 클래스입니다. 이 클래스의 객체는 System::MakeArray() 및 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 200
url: /ko/cpp/system/array/
---
## Array class


배열 데이터 구조를 나타내는 클래스입니다. 이 클래스의 객체는 [System::MakeArray()](../makearray/) 및 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 이 포인터를 사용하십시오.

```cpp
template<typename T>class Array : public virtual System::Object,
                                  public System::Collections::Generic::IList<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 배열 요소의 타입 |
## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const T\&) override | 현재 객체가 나타내는 배열이 읽기 전용이므로 지원되지 않습니다. |
| [Array](./array/)() | 빈 배열을 생성합니다. |
| [Array](./array/)(int, const T\&) | 채우기 생성자. |
| [Array](./array/)(typename std::enable_if\<std::is_arithmetic\<T\>::value\&&std::is_arithmetic\<ValueType\>::value\&&std::is_convertible\<ValueType, T\>::value, int\>::type, ValueType) | 채우기 생성자. |
| [Array](./array/)(int, const T) | 채우기 생성자. |
| [Array](./array/)(vector_t\&&) | 이동 생성자. |
| [Array](./array/)(const vector_t\&) | 복사 생성자. |
| [Array](./array/)(const std::vector\<Q\>\&) | [Array](./) 객체를 생성하고, 값의 타입이 **T**와 동일하지만 **[UnderlyingType](./underlyingtype/)**와 다른 std::vector 객체에서 복사한 값으로 채웁니다. |
| [Array](./array/)(std::vector\<Q\>\&&) | [Array](./) 객체를 생성하고, 값의 타입이 **T**와 동일하지만 **[UnderlyingType](./underlyingtype/)**와 다른 std::vector 객체에서 이동한 값으로 채웁니다. |
| [Array](./array/)(std::initializer_list\<UnderlyingType\>) | [Array](./) 객체를 생성하고, 지정된 초기화 리스트에 포함된 **[UnderlyingType](./underlyingtype/)** 타입 요소들의 값으로 채웁니다. |
| [Array](./array/)(const std::array\<UnderlyingType, InitArraySize\>\&) | 지정된 **[UnderlyingType](./underlyingtype/)** 유형의 요소를 포함하는 배열에서 값을 가져와 [Array](./) 객체를 생성하고 채웁니다. |
| [Array](./array/)(std::initializer_list\<bool\>, int) | bool 유형의 요소를 포함하는 지정된 초기화 목록에서 값을 가져와 [Array](./) 객체를 생성하고 채웁니다. |
| [begin](./begin/)() | 컨테이너의 첫 번째 요소에 대한 반복자를 반환합니다. 컨테이너가 비어 있으면 반환된 반복자는 [end()](./end/)와 동일합니다. |
| [begin](./begin/)() const | const 한정된 컨테이너의 첫 번째 요소에 대한 반복자를 반환합니다. 컨테이너가 비어 있으면 반환된 반복자는 [end()](./end/)와 동일합니다. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const T\&) | 정렬된 배열에서 이진 검색을 수행합니다. |
| static [BinarySearch](./binarysearch/)(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) | 구현되지 않음. |
| [cbegin](./cbegin/)() const | 컨테이너의 첫 번째 const 한정 요소에 대한 반복자를 반환합니다. 컨테이너가 비어 있으면 반환된 반복자는 [cend()](./cend/)와 동일합니다. |
| [cend](./cend/)() const | 컨테이너의 마지막 요소 다음에 있는 요소에 대한 반복자를 반환합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [Clear](./clear/)() override | 현재 객체가 나타내는 배열이 읽기 전용이므로 지원되지 않습니다. |
| static [Clear](./clear/)(const ArrayPtr\<Type\>\&, int, int) | 지정된 배열에서 **startIndex** 인덱스부터 **count**개의 값을 기본값으로 교체합니다. |
| [Clone](./clone/)() | 배열을 복제합니다. |
| static [ConstrainedCopy](./constrainedcopy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 지정된 소스에서 시작하여 [System.Array](./)의 요소 범위를 복사합니다. |
| [Contains](./contains/)(const T\&) const override | 지정된 항목이 배열에 있는지 확인합니다. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) | 지정된 변환 대리자를 사용하여 지정된 배열의 요소를 **OutputType** 유형으로 변환한 뒤, 새로운 [Array](./) 객체를 생성하고 채웁니다. |
| static [ConvertAll](./convertall/)(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) | 지정된 변환 함수 객체를 사용하여 지정된 배열의 요소를 **OutputType** 유형으로 변환한 뒤, 새로운 [Array](./) 객체를 생성하고 채웁니다. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) | 소스 배열에서 대상 배열로 지정된 개수만큼 요소를 복사합니다. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) | 소스 배열 뷰에서 대상 배열로 지정된 개수만큼 요소를 복사합니다. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) | 소스 배열에서 대상 배열 뷰로 지정된 개수만큼 요소를 복사합니다. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) | 소스 배열 뷰에서 대상 배열 뷰로 지정된 개수만큼 요소를 복사합니다. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) | 스택에 있는 소스 배열에서 대상 배열로 지정된 개수만큼 요소를 복사합니다. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) | 소스 배열에서 스택에 있는 대상 배열로 지정된 개수만큼 요소를 복사합니다. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) | 스택에 있는 소스 배열에서 스택에 있는 대상 배열로 지정된 개수만큼 요소를 복사합니다. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 지정된 인덱스에서 시작하는 소스 배열의 지정된 개수만큼 요소를 대상 배열의 지정된 위치로 복사합니다. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 지정된 인덱스에서 시작하는 소스 배열 뷰의 지정된 개수만큼 요소를 대상 배열의 지정된 위치로 복사합니다. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | 지정된 인덱스에서 시작하는 소스 배열의 지정된 개수만큼 요소를 대상 배열 뷰의 지정된 위치로 복사합니다. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) | 지정된 인덱스에서 시작하는 소스 배열 뷰의 지정된 개수만큼 요소를 대상 배열 뷰의 지정된 위치로 복사합니다. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) | 스택에 있는 소스 배열에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 대상 배열의 지정된 위치로 복사합니다. |
| static [Copy](./copy/)(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) | 소스 배열에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 스택에 있는 대상 배열의 지정된 위치로 복사합니다. |
| static [Copy](./copy/)(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | 스택에 있는 소스 배열에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 스택에 있는 대상 배열의 지정된 위치로 복사합니다. |
| static [Copy](./copy/)(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) | 소스 배열 뷰에서 지정된 인덱스부터 시작하여 지정된 개수만큼 요소를 스택에 있는 대상 배열의 지정된 위치로 복사합니다. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | 현재 배열의 모든 요소를 지정된 대상 배열로 복사합니다. 요소는 arrayIndex 인수로 지정된 인덱스부터 대상 배열에 삽입됩니다. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t) const | 현재 배열의 모든 요소를 지정된 대상 배열에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열에 삽입됩니다. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t) const | 현재 배열의 모든 요소를 지정된 대상 배열 뷰에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열 뷰에 삽입됩니다. |
| [CopyTo](./copyto/)(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const | 현재 배열에서 지정된 위치부터 지정된 개수만큼의 요소를 지정된 대상 배열에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열에 삽입됩니다. |
| [CopyTo](./copyto/)(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const | 현재 배열에서 지정된 위치부터 지정된 개수만큼의 요소를 지정된 대상 배열 뷰에 복사합니다. 요소는 dstIndex 인수로 지정된 인덱스부터 대상 배열 뷰에 삽입됩니다. |
| [Count](./count/)() const | 배열의 모든 차원에 있는 전체 요소 수를 나타내는 숫자를 반환합니다. |
| [crbegin](./crbegin/)() const | 역전된 컨테이너의 첫 번째 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 마지막 요소에 해당합니다. 컨테이너가 비어 있으면 반환된 반복자는 [crend()](./crend/)와 동일합니다. |
| [crend](./crend/)() const | 역전된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 첫 번째 요소 이전에 해당합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [data](./data/)() | 배열 요소를 저장하는 내부 데이터 구조에 대한 참조를 반환합니다. |
| [data](./data/)() const | 배열 요소를 저장하는 내부 데이터 구조에 대한 상수 참조를 반환합니다. |
| [data_ptr](./data_ptr/)() | 배열 요소가 저장된 메모리 버퍼의 시작을 가리키는 원시 포인터를 반환합니다. |
| [data_ptr](./data_ptr/)() const | 배열 요소가 저장된 메모리 버퍼의 시작을 가리키는 상수 원시 포인터를 반환합니다. |
| [end](./end/)() | 컨테이너의 마지막 요소 다음에 있는 요소에 대한 반복자를 반환합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [end](./end/)() const | const 한정된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 반복자를 반환합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| static [Exists](./exists/)(ArrayPtr\<T\>, std::function\<bool(T)>) | 지정된 [Array](./) 객체가 지정된 술어의 요구 조건을 만족하는 요소를 포함하는지 확인합니다. |
| static [Find](./find/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 지정된 배열에서 지정된 술어의 조건을 만족하는 첫 번째 요소를 검색합니다. |
| static [FindAll](./findall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 지정된 술어에 정의된 조건과 일치하는 모든 요소를 검색합니다. |
| static [FindIndex](./findindex/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 지정된 배열에서 지정된 술어의 조건을 만족하는 첫 번째 요소를 검색합니다. |
| static [ForEach](./foreach/)(const ArrayPtr\<T\>\&, System::Action\<T\>) | 지정된 배열의 각 요소에 지정된 작업을 수행합니다. |
| [get_Count](./get_count/)() const override | 배열의 크기를 반환합니다. |
| [get_IsReadOnly](./get_isreadonly/)() const override | 배열이 읽기 전용인지 여부를 나타냅니다. |
| [get_Length](./get_length/)() const | 배열의 모든 차원에 있는 전체 요소 수를 나타내는 32비트 정수를 반환합니다. |
| [get_LongLength](./get_longlength/)() const | 배열의 모든 차원에 있는 전체 요소 수를 나타내는 64비트 정수를 반환합니다. |
| [get_Rank](./get_rank/)() const | 구현되지 않음. |
| [GetEnumerator](./getenumerator/)() override | 현재 객체가 나타내는 배열 요소에 대한 IEnumerator 인터페이스를 제공하는 [Enumerator](./enumerator/) 객체에 대한 포인터를 반환합니다. |
| [GetLength](./getlength/)(int) | 지정된 차원의 요소 개수를 반환합니다. |
| [GetLongLength](./getlonglength/)(int) | 지정된 차원의 요소 개수를 64비트 정수로 반환합니다. |
| [GetLowerBound](./getlowerbound/)(int) const | 지정된 차원의 하한을 반환합니다. |
| [GetSizeTLength](./getsizetlength/)() const | 배열의 모든 차원에 있는 전체 요소 수를 나타내는 std::size_t 변수를 반환합니다. |
| [GetUpperBound](./getupperbound/)(int) | 지정된 차원의 상한을 반환합니다. |
| [idx_get](./idx_get/)(int) const override | 지정된 인덱스에 있는 항목을 반환합니다. |
| [idx_set](./idx_set/)(int, T) override | 지정된 값을 지정된 인덱스에 있는 배열 항목으로 설정합니다. |
| [IndexOf](./indexof/)(const T\&) const override | 배열에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | 배열에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | 지정된 인덱스부터 시작하여 배열에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다. |
| static [IndexOf](./indexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | 시작 인덱스와 범위 내 요소 수로 지정된 배열의 항목 범위에서 지정된 항목이 처음 나타나는 인덱스를 결정합니다. |
| [Init](./init/)(const T) | 현재 객체가 나타내는 배열을 지정된 배열의 값으로 채웁니다. |
| [Initialize](./initialize/)() | **T** 유형의 기본 생성 객체로 배열을 채웁니다. |
| [Insert](./insert/)(int, const T\&) override | 현재 객체가 나타내는 배열이 읽기 전용이므로 지원되지 않습니다. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) | 시작 인덱스와 범위 내 요소 수로 지정된 배열의 항목 범위에서 지정된 항목이 마지막으로 나타나는 인덱스를 결정합니다. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) | 지정된 인덱스부터 시작하여 배열에서 지정된 항목이 마지막으로 나타나는 인덱스를 결정합니다. |
| static [LastIndexOf](./lastindexof/)(const ArrayPtr\<ArrayType\>\&, const ValueType\&) | 배열에서 지정된 항목이 마지막으로 나타나는 인덱스를 결정합니다. |
| [Max](./max/)() const | [operator<()](../operator_/)를 사용하여 요소를 비교하면서 배열에서 가장 큰 요소를 찾습니다. |
| [Min](./min/)() const | [operator<()](../operator_/)를 사용하여 요소를 비교하면서 배열에서 가장 작은 요소를 찾습니다. |
| [operator[]](./operator[]/)(int) | 지정된 인덱스에 있는 항목을 반환합니다. |
| [operator[]](./operator[]/)(int) const | 지정된 인덱스에 있는 항목을 반환합니다. |
| [rbegin](./rbegin/)() | 역전된 컨테이너의 첫 번째 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 마지막 요소에 해당합니다. 컨테이너가 비어 있는 경우, 반환된 반복자는 [rend()](./rend/)와 같습니다. |
| [rbegin](./rbegin/)() const | 역전된 컨테이너의 첫 번째 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 마지막 요소에 해당합니다. 컨테이너가 비어 있는 경우, 반환된 반복자는 [rend()](./rend/)와 같습니다. |
| [Remove](./remove/)(const T\&) override | 현재 객체가 나타내는 배열이 읽기 전용이므로 지원되지 않습니다. |
| [RemoveAt](./removeat/)(int) override | 현재 객체가 나타내는 배열이 읽기 전용이므로 지원되지 않습니다. |
| [rend](./rend/)() | 역전된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 첫 번째 요소 이전에 해당합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| [rend](./rend/)() const | 역전된 컨테이너의 마지막 요소 다음에 있는 요소에 대한 역방향 반복자를 반환합니다. 이는 역전되지 않은 컨테이너의 첫 번째 요소 이전에 해당합니다. 이 요소는 자리표시자 역할을 하며, 접근을 시도하면 정의되지 않은 동작이 발생합니다. |
| static [Resize](./resize/)(ArrayPtr\<Type\>\&, int) | 지정된 배열의 크기를 지정된 값으로 변경하거나 지정된 크기의 새 배열을 생성합니다. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&) | 지정된 배열의 요소 순서를 반전시킵니다. |
| static [Reverse](./reverse/)(const ArrayPtr\<Type\>\&, int, int) | 지정된 배열에서 요소 범위의 순서를 반전시킵니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 배열이 저장된 포인터를 약한 포인터로 취급하도록 만듭니다(해당되는 경우). |
| [SetValue](./setvalue/)(const T\&, int) | 지정된 인덱스에 있는 요소의 값을 설정합니다. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&) | 기본 비교자를 사용하여 지정된 배열의 요소를 정렬합니다. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, int, int) | 기본 비교자를 사용하여 지정된 배열의 요소 범위를 정렬합니다. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | 지정된 비교자를 사용하여 지정된 배열의 요소를 정렬합니다. |
| static [Sort](./sort/)(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) | 구현되지 않음. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) | 키를 포함하는 배열 하나와 해당하는 항목을 포함하는 다른 배열 두 개를, 키 배열의 값에 따라 정렬합니다. 이때 요소는 operator<를 사용하여 비교됩니다. |
| static [Sort](./sort/)(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) | 키를 포함하는 배열 하나와 해당하는 항목을 포함하는 다른 배열 두 개를, 키 배열의 값에 따라 정렬합니다. 이때 요소는 기본 비교자를 사용하여 비교됩니다. |
| static [TrueForAll](./trueforall/)(System::ArrayPtr\<T\>, System::Predicate\<T\>) | 지정된 배열의 모든 요소가 지정된 술어가 정의한 조건을 만족하는지 여부를 결정합니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [const_iterator](./const_iterator/) | 상수 반복자 타입. |
| [const_reverse_iterator](./const_reverse_iterator/) | 상수 역방향 반복자 타입. |
| [EnumerablePtr](./enumerableptr/) | **T** 유형의 요소를 포함하는 IEnumerable 객체를 가리키는 공유 포인터 타입에 대한 별칭입니다. |
| [EnumeratorPtr](./enumeratorptr/) | IEnumerator 객체를 가리키는 공유 포인터 타입에 대한 별칭이며, **T** 형식의 요소를 포함합니다. |
| [iterator](./iterator/) | 반복자 타입. |
| [reverse_iterator](./reverse_iterator/) | 역방향 반복자 타입. |
| [UnderlyingType](./underlyingtype/) | 배열의 각 요소를 나타내는 데 사용되는 타입에 대한 별칭. |
| [ValueType](./valuetype/) | 배열 요소들의 타입에 대한 별칭. |
## 비고



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
  // 배열을 생성하고 채웁니다.
  auto arrayPtr = MakeObject<Array<int32_t>>(5, 0);
  for (auto i = 0; i < arrayPtr->get_Length(); ++i)
  {
    arrayPtr[i] = 5 - i;
  }

  // 배열 항목을 출력합니다.
  Print(arrayPtr);

  // 배열 항목을 오름차순으로 정렬합니다.
  Array<int32_t>::Sort(arrayPtr);

  // 배열 항목을 출력합니다.
  Print(arrayPtr);

  // 배열 항목의 개수를 출력합니다.
  std::cout << arrayPtr->get_Length() << std::endl;

  // 값이 4와 같은 항목의 인덱스를 출력합니다.
  std::cout << arrayPtr->IndexOf(4) << std::endl;

  // 배열의 크기를 조정합니다.
  Array<int32_t>::Resize(arrayPtr, 3);

  // 배열 항목을 출력합니다.
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

## 또 보기

* Class [Object](../object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
