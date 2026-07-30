---
title: "System::Drawing::ImageFormatConverter::ConvertTo method"
linktitle: "ConvertTo"
second_title: "Aspose.Font für C++"
description: "System::Drawing::ImageFormatConverter::ConvertTo method. Konvertiert ein Objekt in einen bestimmten Typ in C++."
type: docs
weight: 300
url: /de/cpp/system.drawing/imageformatconverter/convertto/
---
## ImageFormatConverter::ConvertTo(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) method


Konvertiert ein Objekt in einen spezifischen Typ.

```cpp
SharedPtr<Object> System::Drawing::ImageFormatConverter::ConvertTo(const SharedPtr<ComponentModel::ITypeDescriptorContext> &context, const SharedPtr<Globalization::CultureInfo> &culture, const SharedPtr<Object> &value, const TypeInfo &destinationType) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| context | const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) Konvertierungskontextinformationen. |
| Kultur | const SharedPtr\<Globalization::CultureInfo\>\& | Kultur, die beim Konvertieren von Objekten verwendet wird. |
| value | const SharedPtr\<Object\>\& | [Object](../../../system/object/) zum Konvertieren. |
| destinationType | const TypeInfo\& | Typ, zu dem konvertiert werden soll. |

### ReturnValue

Konvertiertes Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Konvertiert ein Objekt in einen spezifischen Typ.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) Konvertierungskontextinformationen. |
| Kultur | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Kultur, die beim Konvertieren von Objekten verwendet wird. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) zum Konvertieren. |
| destinationType | const System::TypeInfo\& | Typ, zu dem konvertiert werden soll. |

### ReturnValue

Konvertiertes Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Konvertiert ein Objekt in einen spezifischen Typ.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) zum Konvertieren. |
| destinationType | const System::TypeInfo\& | Typ, zu dem konvertiert werden soll. |

### ReturnValue

Konvertiertes Objekt.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
