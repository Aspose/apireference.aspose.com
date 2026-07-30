---
title: "System::Xml::ValidationType énum"
linktitle: "ValidationType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::ValidationType enum. Spécifie le type de validation à effectuer en C++."
type: docs
weight: 5500
url: /fr/cpp/system.xml/validationtype/
---
## ValidationType enum


Spécifie le type de validation à effectuer.

```cpp
enum class ValidationType
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | Aucune validation n'est effectuée, et aucune erreur de validation n'est levée. Ce paramètre crée un analyseur non validateur conforme à XML 1.0. |
| Auto | 1 | Valide si des informations DTD ou de schéma sont trouvées. |
| DTD | 2 | Valide selon le DTD. |
| XDR | 3 | Valide selon les schémas XML-Data Reduced (XDR), y compris les schémas XDR en ligne. Les schémas XDR sont reconnus à l'aide du préfixe d'espace de noms **x-schema** ou de la valeur [XmlValidatingReader::get_Schemas](../xmlvalidatingreader/get_schemas/). |
| Schema | 4 | Valide selon le langage de définition XML [Schema](../../system.xml.schema/) (XSD), y compris les schémas XML en ligne. Les schémas XML sont associés aux URI d'espace de noms soit en utilisant l'attribut **schemaLocation**, soit les **Schemas** fournis. |

## Voir aussi

* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
