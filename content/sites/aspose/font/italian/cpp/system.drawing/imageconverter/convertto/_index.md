---
title: "System::Drawing::ImageConverter::ConvertTo metodo"
linktitle: "ConvertTo"
second_title: "Aspose.Font per C++"
description: "System::Drawing::ImageConverter::ConvertTo metodo. Converte l'oggetto in un tipo specifico in C++."
type: docs
weight: 200
url: /it/cpp/system.drawing/imageconverter/convertto/
---
## ImageConverter::ConvertTo(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Converte l'oggetto in un tipo specifico.

```cpp
System::SharedPtr<System::Object> System::Drawing::ImageConverter::ConvertTo(const System::SharedPtr<System::ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| context | const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) informazioni sul contesto di conversione |
| cultura | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Cultura da utilizzare durante la conversione degli oggetti |
| valore | const System::SharedPtr\<System::Object\>\& | Un oggetto da convertire. |
| destinationType | const System::TypeInfo\& | Un tipo in cui convertire. |

### ReturnValue

Oggetto convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## ImageConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


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
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
