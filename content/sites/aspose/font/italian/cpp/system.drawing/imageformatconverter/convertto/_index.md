---
title: "System::Drawing::ImageFormatConverter::ConvertTo metodo"
linktitle: "ConvertTo"
second_title: "Aspose.Font per C++"
description: "System::Drawing::ImageFormatConverter::ConvertTo metodo. Converte l'oggetto in un tipo specifico in C++."
type: docs
weight: 300
url: /it/cpp/system.drawing/imageformatconverter/convertto/
---
## ImageFormatConverter::ConvertTo(const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, const SharedPtr\<Object\>\&, const TypeInfo\&) method


Converte l'oggetto in un tipo specifico.

```cpp
SharedPtr<Object> System::Drawing::ImageFormatConverter::ConvertTo(const SharedPtr<ComponentModel::ITypeDescriptorContext> &context, const SharedPtr<Globalization::CultureInfo> &culture, const SharedPtr<Object> &value, const TypeInfo &destinationType) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| context | const SharedPtr\<ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) informazioni sul contesto di conversione. |
| cultura | const SharedPtr\<Globalization::CultureInfo\>\& | Culture da utilizzare durante la conversione degli oggetti. |
| value | const SharedPtr\<Object\>\& | [Object](../../../system/object/) da convertire. |
| destinationType | const TypeInfo\& | Tipo in cui convertire. |

### ReturnValue

Oggetto convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converte l'oggetto in un tipo specifico.

```cpp
virtual System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| context | const System::SharedPtr\<ITypeDescriptorContext\>\& | [Object](../../../system/object/) informazioni sul contesto di conversione. |
| cultura | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Culture da utilizzare durante la conversione degli oggetti. |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) da convertire. |
| destinationType | const System::TypeInfo\& | Tipo in cui convertire. |

### ReturnValue

Oggetto convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## ImageFormatConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converte l'oggetto in un tipo specifico.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) da convertire. |
| destinationType | const System::TypeInfo\& | Tipo in cui convertire. |

### ReturnValue

Oggetto convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageFormatConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
