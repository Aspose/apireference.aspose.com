---
title: "System::Xml::Schema::XmlSchemaValidationFlags énumération"
linktitle: "XmlSchemaValidationFlags"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaValidationFlags énumération. Spécifie les options de validation du schéma utilisées par les classes XmlSchemaValidator et XmlReader en C++."
type: docs
weight: 7900
url: /fr/cpp/system.xml.schema/xmlschemavalidationflags/
---
## XmlSchemaValidationFlags enum


Spécifie les options de validation du schéma utilisées par les classes [XmlSchemaValidator](../xmlschemavalidator/) et [XmlReader](../../system.xml/xmlreader/).

```cpp
enum class XmlSchemaValidationFlags
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | Ne pas traiter les contraintes d'identité, les schémas en ligne, les indications d'emplacement du schéma, ou signaler les avertissements de validation du schéma. |
| ProcessInlineSchema | 1 | Traiter les schémas en ligne rencontrés lors de la validation. |
| ProcessSchemaLocation | 2 | Traiter les indications d'emplacement du schéma (**xsi:schemaLocation**, **xsi:noNamespaceSchemaLocation**) rencontrées lors de la validation. |
| ReportValidationWarnings | 4 | Signaler les avertissements de validation du schéma rencontrés lors de la validation. |
| ProcessIdentityConstraints | 8 | Traiter les contraintes d'identité (**xs:ID**, **xs:IDREF**, **xs:key**, **xs:keyref**, **xs:unique**) rencontrées lors de la validation. |
| AllowXmlAttributes | 16 | Autoriser les attributs xml:* même s'ils ne sont pas définis dans le schéma. Les attributs seront validés en fonction de leur type de données. |

## Voir aussi

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
