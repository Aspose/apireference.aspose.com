---
title: "System::Drawing::ImageConverter::ConvertTo μέθοδος"
linktitle: "ConvertTo"
second_title: "Aspose.Page για C++"
description: "System::Drawing::ImageConverter::ConvertTo μέθοδος. Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο σε C++."
type: docs
weight: 200
url: /el/cpp/system.drawing/imageconverter/convertto/
---
## ImageConverter::ConvertTo(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο.

```cpp
System::SharedPtr<System::Object> System::Drawing::ImageConverter::ConvertTo(const System::SharedPtr<System::ComponentModel::ITypeDescriptorContext> &context, const System::SharedPtr<System::Globalization::CultureInfo> &culture, const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| context | const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\& | [Object](../../../system/object/) πληροφορίες πλαισίου μετατροπής |
| πολιτιστική ρύθμιση | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | Πολιτισμός για χρήση κατά τη μετατροπή αντικειμένων |
| τιμή | const System::SharedPtr\<System::Object\>\& | Ένα αντικείμενο για μετατροπή. |
| destinationType | const System::TypeInfo\& | Ένας τύπος για μετατροπή. |

### ReturnValue

Μετατρεπόμενο αντικείμενο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ITypeDescriptorContext](../../../system.componentmodel/itypedescriptorcontext/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## ImageConverter::ConvertTo(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) method


Μετατρέπει το αντικείμενο σε συγκεκριμένο τύπο.

```cpp
System::SharedPtr<System::Object> System::ComponentModel::TypeConverter::ConvertTo(const System::SharedPtr<System::Object> &value, const System::TypeInfo &destinationType)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| value | const System::SharedPtr\<System::Object\>\& | [Object](../../../system/object/) για μετατροπή. |
| destinationType | const System::TypeInfo\& | Τύπος για μετατροπή σε. |

### ReturnValue

Μετατρεπόμενο αντικείμενο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [ImageConverter](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
