---
title: "System::ComponentModel::TypeConverter::ConvertTo 메서드"
linktitle: "ConvertTo"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::TypeConverter::ConvertTo 메서드. 객체를 특정 타입으로 변환합니다 (C++)."
type: docs
weight: 500
url: /ko/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


객체를 특정 유형으로 변환합니다.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) 변환 컨텍스트 정보. |
| 문화 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 객체를 변환할 때 사용할 문화. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 변환할. |
| destinationType | const System::TypeInfo\& | 변환할 유형. |

### ReturnValue

변환된 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


객체를 특정 유형으로 변환합니다.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) 변환할. |
| destinationType | const System::TypeInfo\& | 변환할 유형. |

### ReturnValue

변환된 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
