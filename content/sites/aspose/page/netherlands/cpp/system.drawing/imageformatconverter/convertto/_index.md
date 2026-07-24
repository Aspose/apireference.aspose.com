---
title: "System::Drawing::ImageFormatConverter::ConvertTo method"
linktitle: "ConvertTo"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::ImageFormatConverter::ConvertTo method. Converteert object naar een specifiek type in C++."
type: docs
weight: 300
url: /nl/cpp/system.drawing/imageformatconverter/convertto/
---
## ImageFormatConverter::ConvertTo(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) method


Converteert object naar een specifiek type.

```cpp
SharedPtr<Object> System::Drawing::ImageFormatConverter::ConvertTo(const SharedPtr<ComponentModel::ITypeDescriptorContext> &context, const SharedPtr<Globalization::CultureInfo> &culture, const SharedPtr<Object> &value, const TypeInfo &destinationType) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| context | const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) conversiecontextinformatie. |
| cultuur | const SharedPtr\<Globalization::CultureInfo\>\& | Cultuur die gebruikt moet worden bij het converteren van objecten. |
| value | const SharedPtr\<Object\>\& | [Object](../../../system/object/) om te converteren. |
| destinationType | const TypeInfo\& | Type om naar te converteren. |

### ReturnValue

Geconverteerd object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converteert object naar een specifiek type.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) conversiecontextinformatie. |
| cultuur | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Cultuur die gebruikt moet worden bij het converteren van objecten. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) om te converteren. |
| destinationType | const System::TypeInfo\& | Type om naar te converteren. |

### ReturnValue

Geconverteerd object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converteert object naar een specifiek type.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) om te converteren. |
| destinationType | const System::TypeInfo\& | Type om naar te converteren. |

### ReturnValue

Geconverteerd object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
