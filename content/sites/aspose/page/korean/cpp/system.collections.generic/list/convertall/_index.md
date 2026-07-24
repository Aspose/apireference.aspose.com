---
title: "System::Collections::Generic::List::ConvertAll 메서드"
linktitle: "ConvertAll"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::List::ConvertAll 메서드. C++에서 다른 타입으로 변환된 요소들의 리스트를 생성합니다."
type: docs
weight: 1300
url: /ko/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


다른 유형으로 변환된 요소들의 리스트를 생성합니다.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| 매개변수 | 설명 |
| --- | --- |
| OutputType | 출력 리스트 요소 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) 를 사용하여 항목을 변환합니다. |

### ReturnValue

변환된 요소들의 새로 생성된 리스트.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
