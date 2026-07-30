---
title: "Classe System::Security::SecurityElement"
linktitle: "SecurityElement"
second_title: "Aspose.Font pour C++"
description: "Classe System::Security::SecurityElement. Modèle d'objet XML pour l'encodage d'objets de sécurité. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 300
url: /fr/cpp/system.security/securityelement/
---
## SecurityElement class


Modèle d'objet XML pour l'encodage d'objets de sécurité. Non implémenté. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SecurityElement : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | Ajoute un attribut à la balise. |
| [AddChild](./addchild/)(SecurityElement) | Ajoute une balise enfant. |
| [Attribute](./attribute/)(const String\&) | Obtient la valeur de l'attribut. |
| [Copy](./copy/)() | Clone la balise. |
| [Equal](./equal/)(SecurityElement) | Vérifie l'égalité des paramètres. |
| static [Escape](./escape/)(const String\&) | Échappe les caractères dans la chaîne XML. |
| static [FromString](./fromstring/)(const String\&) | Crée un élément à partir du code XML. |
| [get_Attributes](./get_attributes/)() | Obtient les attributs de la balise. |
| [get_Children](./get_children/)() | Obtient les objets enfants de la balise. |
| [get_Tag](./get_tag/)() | Obtient le nom de la balise. |
| [get_Text](./get_text/)() | Obtient le texte interne de la balise. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | Vérifie si le nom de l'attribut est valide. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | Vérifie si la valeur de l'attribut est valide. |
| static [IsValidTag](./isvalidtag/)(const String\&) | Vérifie si la balise est valide. |
| static [IsValidText](./isvalidtext/)(const String\&) | Vérifie si le texte est valide. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | Obtient la balise enfant par son nom. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | Obtient le texte interne de la balise enfant par le nom de la balise. |
| [SecurityElement](./securityelement/)(const String\&) | Constructeur. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | Constructeur. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | Définit les attributs de la balise. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | Définit les objets enfants de la balise. |
| [set_Tag](./set_tag/)(const String\&) | Définit le nom de la balise. |
| [set_Text](./set_text/)(const String\&) | Définit le texte interne de la balise. |
| [ToString](./tostring/)() const override | Convertit la balise en chaîne. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)
