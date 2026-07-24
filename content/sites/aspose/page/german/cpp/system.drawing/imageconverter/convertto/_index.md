---
title: "System::Drawing::ImageConverter::ConvertTo Methode"
linktitle: "ConvertTo"
second_title: "Aspose.Page für C++"
description: "System::Drawing::ImageConverter::ConvertTo Methode. Konvertiert ein Objekt in einen bestimmten Typ in C++."
type: docs
weight: 200
url: /de/cpp/system.drawing/imageconverter/convertto/
---
## ImageConverter::ConvertTo(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Konvertiert ein Objekt in einen spezifischen Typ.

```cpp
System::SharedPtr<System::Object> System::Drawing::ImageConverter::ConvertTo(const System::SharedPtr<System::ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| context | const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) Konvertierungs-Kontextinformationen |
| Kultur | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Kultur, die beim Konvertieren von Objekten verwendet wird |
| Wert | const System::SharedPtr\<System::Object\>\& | Ein Objekt zum Konvertieren. |
| destinationType | const System::TypeInfo\& | Ein Typ, zu dem konvertiert werden soll. |

### ReturnValue

Konvertiertes Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Konvertiert ein Objekt in einen spezifischen Typ.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) zum Konvertieren. |
| destinationType | const System::TypeInfo\& | Typ, in den konvertiert werden soll. |

### ReturnValue

Konvertiertes Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
