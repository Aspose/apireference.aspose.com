---
title: "System::ICustomFormatter::Format 메서드"
linktitle: "형식"
second_title: "C++용 Aspose.Page"
description: "System::ICustomFormatter::Format 메서드. C++에서 지정된 형식을 사용하여 현재 객체가 나타내는 값의 문자열 표현을 반환합니다."
type: docs
weight: 100
url: /ko/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


현재 객체가 나타내는 값을 지정된 형식으로 문자열로 반환합니다.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 형식 | System::String | 문자열 형식 |
| arg | System::SharedPtr\<System::Object\> | 포맷될 객체 |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | 형식 정보를 제공하는 객체 |

### ReturnValue

**arg**의 문자열 표현은 **format**과 **formatProvider**가 지정한 형식에 따라 포맷됩니다

## 또 보기

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
