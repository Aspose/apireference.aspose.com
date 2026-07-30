---
title: "classe System::Xml::Xsl::XsltSettings"
linktitle: "XsltSettings"
second_title: "Aspose.Font pour C++"
description: "classe System::Xml::Xsl::XsltSettings. Spécifie les fonctionnalités XSLT à prendre en charge lors de l'exécution de la feuille de style XSLT en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


Spécifie les fonctionnalités XSLT à prendre en charge pendant l'exécution de la feuille de style XSLT.

```cpp
class XsltSettings : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [get_Default](./get_default/)() | Renvoie un objet [XsltSettings](./) avec les paramètres par défaut. La prise en charge de la fonction XSLT **document()** et des blocs de script intégrés est désactivée. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | Renvoie une valeur indiquant s'il faut activer la prise en charge de la fonction XSLT **document()**. |
| [get_EnableScript](./get_enablescript/)() | Renvoie une valeur indiquant s'il faut activer la prise en charge des blocs de script intégrés. |
| static [get_TrustedXslt](./get_trustedxslt/)() | Renvoie un objet [XsltSettings](./) qui active la prise en charge de la fonction XSLT **document()** et des blocs de script intégrés. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | Définit une valeur indiquant s'il faut activer la prise en charge de la fonction XSLT **document()**. |
| [set_EnableScript](./set_enablescript/)(bool) | Définit une valeur indiquant s'il faut activer la prise en charge des blocs de script intégrés. |
| [XsltSettings](./xsltsettings/)() | Initialise une nouvelle instance de la classe [XsltSettings](./) avec les paramètres par défaut. |
| [XsltSettings](./xsltsettings/)(bool, bool) | Initialise une nouvelle instance de la classe [XsltSettings](./) avec les paramètres spécifiés. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
