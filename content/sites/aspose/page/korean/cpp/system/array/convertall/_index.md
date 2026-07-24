---
title: "System::Array::ConvertAll 메서드"
linktitle: "ConvertAll"
second_title: "C++용 Aspose.Page"
description: "System::Array::ConvertAll 메서드. 지정된 배열의 요소들을 지정된 변환자 대리자를 사용하여 OutputType 유형으로 변환한 새 Array 객체를 생성하고 채웁니다 (C++)."
type: docs
weight: 4800
url: /ko/cpp/system/array/convertall/
---
## Array::ConvertAll(ArrayPtr\<InputType\>, Converter\<InputType, OutputType\>) method


새 [Array](../) 객체를 생성하고 지정된 배열의 요소들을 지정된 변환자 대리자를 사용하여 **OutputType** 유형으로 변환하여 채웁니다.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, Converter<InputType, OutputType> converter)
```


| 매개변수 | 설명 |
| --- | --- |
| InputType | 입력 배열 요소의 유형 |
| OutputType | 결과 배열 요소의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | 하나의 [Array](../) 객체 |
| converter | Converter\<InputType, OutputType\> | 입력 배열의 각 요소를 **OutputType** 유형의 동등한 값으로 변환하는 데 사용되는 [Converter](../../converter/) 객체 |

### ReturnValue

**input_array**의 값에 동등한 **OutputType** 유형의 값을 포함하는 새 배열

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Converter](../../converter/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::ConvertAll(ArrayPtr\<InputType\>, std::function\<OutputType(InputType)>) method


새 [Array](../) 객체를 생성하고 지정된 배열의 요소들을 지정된 변환자 함수 객체를 사용하여 **OutputType** 유형으로 변환하여 채웁니다.

```cpp
template<typename InputType,typename OutputType> static ArrayPtr<OutputType> System::Array<T>::ConvertAll(ArrayPtr<InputType> input_array, std::function<OutputType(InputType)> converter)
```


| 매개변수 | 설명 |
| --- | --- |
| InputType | 입력 배열 요소의 유형 |
| OutputType | 결과 배열 요소의 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| input_array | ArrayPtr\<InputType\> | 하나의 [Array](../) 객체 |
| converter | std::function\<OutputType(InputType)> | 입력 배열의 각 요소를 **OutputType** 유형의 동등한 값으로 변환하는 데 사용되는 함수 객체 |

### ReturnValue

**input_array**의 값에 동등한 **OutputType** 유형의 값을 포함하는 새 배열

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
