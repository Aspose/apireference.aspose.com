---
title: "System::Drawing::FontConverter::ConvertTo method"
linktitle: "ConvertTo"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::FontConverter::ConvertTo method. C++에서 객체를 특정 유형으로 변환합니다."
type: docs
weight: 200
url: /ko/cpp/system.drawing/fontconverter/convertto/
---
## FontConverter::ConvertTo(const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


객체를 특정 유형으로 변환합니다.

```cpp
System::SharedPtr<System::Object> System::Drawing::FontConverter::ConvertTo(const System::SharedPtr<ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| context | const System::SharedPtr\<ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) 변환 컨텍스트 정보. |
| 문화 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 객체를 변환할 때 사용할 문화. |
| value | const System::SharedPtr\<System::Object\>\& | 변환할 객체. |
| destinationType | const System::TypeInfo\& | 변환할 유형. |

### ReturnValue

변환된 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FontConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## FontConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FontConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## FontConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [FontConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
