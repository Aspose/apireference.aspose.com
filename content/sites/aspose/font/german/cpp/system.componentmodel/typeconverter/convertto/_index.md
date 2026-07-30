---
title: "System::ComponentModel::TypeConverter::ConvertTo Methode"
linktitle: "ConvertTo"
second_title: "Aspose.Font für C++"
description: "System::ComponentModel::TypeConverter::ConvertTo Methode. Konvertiert ein Objekt in einen spezifischen Typ in C++."
type: docs
weight: 500
url: /de/cpp/system.componentmodel/typeconverter/convertto/
---
## TypeConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [ITypeDescriptorContext](../../itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## TypeConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [TypeConverter](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
