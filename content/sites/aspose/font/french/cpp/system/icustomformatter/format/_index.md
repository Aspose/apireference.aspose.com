---
title: "Méthode System::ICustomFormatter::Format"
linktitle: "Format"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ICustomFormatter::Format. Retourne une représentation sous forme de chaîne d'une valeur représentée par l'objet actuel en utilisant le format spécifié en C++."
type: docs
weight: 100
url: /fr/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


Renvoie une représentation sous forme de chaîne d’une valeur représentée par l’objet actuel en utilisant le format spécifié.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| format | System::String | Le format de chaîne |
| arg | System::SharedPtr\<System::Object\> | L'objet à formater |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | L'objet fournissant les informations de formatage |

### ReturnValue

La représentation sous forme de chaîne de **arg** formatée selon le format spécifié par **format** et **formatProvider**

## Voir aussi

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
