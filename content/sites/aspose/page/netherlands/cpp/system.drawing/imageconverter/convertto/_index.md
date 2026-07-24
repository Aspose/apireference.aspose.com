---
title: "System::Drawing::ImageConverter::ConvertTo methode"
linktitle: "ConvertTo"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::ImageConverter::ConvertTo methode. Converteert een object naar een specifiek type in C++."
type: docs
weight: 200
url: /nl/cpp/system.drawing/imageconverter/convertto/
---
## ImageConverter::ConvertTo(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converteert object naar een specifiek type.

```cpp
System::SharedPtr<System::Object> System::Drawing::ImageConverter::ConvertTo(const System::SharedPtr<System::ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| context | const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) conversie‑contextinformatie |
| cultuur | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Cultuur die gebruikt wordt bij het converteren van objecten |
| value | const System::SharedPtr\<System::Object\>\& | Een object om te converteren. |
| destinationType | const System::TypeInfo\& | Een type om naar te converteren. |

### ReturnValue

Geconverteerd object.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
