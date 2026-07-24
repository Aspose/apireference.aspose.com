---
title: "System::IConvertible::ToType 메서드"
linktitle: "ToType"
second_title: "C++용 Aspose.Page"
description: "System::IConvertible::ToType 메서드. 지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 지정된 System::Type과 동등한 값을 갖는 System::Object로 변환합니다(C++)."
type: docs
weight: 1400
url: /ko/cpp/system/iconvertible/totype/
---
## IConvertible::ToType method


지정된 문화별 형식 정보를 사용하여 이 인스턴스의 값을 지정된 System::Type과 동등한 값을 갖는 [System::Object](../../object/)로 변환합니다.

```cpp
virtual System::SharedPtr<System::Object> System::IConvertible::ToType(const TypeInfo &conversionType, System::SharedPtr<System::IFormatProvider> provider)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| conversionType | const TypeInfo\& | 이 인스턴스의 값이 변환되는 System::Type. |
| provider | System::SharedPtr\<System::IFormatProvider\> | 문화별 형식 정보를 제공하는 [System::IFormatProvider](../../iformatprovider/) 인터페이스 구현. |

### ReturnValue

값이 이 인스턴스와 동등한 conversionType 형식의 [System::Object](../../object/) 인스턴스.

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [IConvertible](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
