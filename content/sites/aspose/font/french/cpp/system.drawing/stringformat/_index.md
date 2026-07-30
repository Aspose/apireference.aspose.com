---
title: "Classe System::Drawing::StringFormat"
linktitle: "FormatDeChaîne"
second_title: "Aspose.Font pour C++"
description: "Classe System::Drawing::StringFormat. Encapsule les informations de mise en page du texte, les manipulations d'affichage et les fonctionnalités OpenType. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 2500
url: /fr/cpp/system.drawing/stringformat/
---
## StringFormat class


Encapsule les informations de mise en page du texte, les manipulations d'affichage et les fonctionnalités OpenType. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) . Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class StringFormat : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Renvoie une copie exacte de l'objet actuel. |
| [get_Alignment](./get_alignment/)() const | Renvoie une valeur qui indique l'alignement horizontal de la chaîne. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Renvoie une valeur qui indique la langue utilisée lorsque les chiffres locaux sont remplacés par des chiffres occidentaux. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Renvoie la méthode de substitution des chiffres. |
| [get_FormatFlags](./get_formatflags/)() const | Renvoie une combinaison binaire de [StringFormatFlags](../stringformatflags/) qui spécifie le format de chaîne représenté par l'objet actuel. |
| static [get_GenericDefault](./get_genericdefault/)() | Renvoie un objet [StringFormat](./) qui représente un format générique par défaut. |
| static [get_GenericTypographic](./get_generictypographic/)() | Renvoie un objet [StringFormat](./) qui représente un format typographique générique. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Renvoie la valeur qui indique comment le préfixe de raccourci clavier est affiché. |
| [get_LineAlignment](./get_linealignment/)() const | Renvoie une valeur qui indique l'alignement vertical de la chaîne. |
| [get_Trimming](./get_trimming/)() const | Renvoie une valeur qui indique comment la chaîne est tronquée. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | Obtient la taille du tableau [CharacterRange](../characterrange/). |
| [GetTabStops](./gettabstops/)(float\&) const | Renvoie les tabulations pour l'objet [StringFormat](./) actuel. |
| [set_Alignment](./set_alignment/)(StringAlignment) | Définit l'alignement horizontal de la chaîne. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Définit les indicateurs de format de chaîne. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Définit la valeur qui spécifie comment le préfixe de raccourci clavier doit être affiché. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Définit l'alignement vertical de la chaîne. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Définit une valeur qui spécifie comment la chaîne est tronquée. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Définit la langue et la méthode de substitution des chiffres. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | Définit un tableau d'objets [CharacterRange](../characterrange/) qui représentent les plages de caractères mesurées par un appel à la méthode MeasureCharacterRanges(). |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Définit les tabulations pour l'objet [StringFormat](./) actuel. |
| [StringFormat](./stringformat/)() | Construit une nouvelle instance de la classe [StringFormat](./). |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Construit une nouvelle instance de la classe [StringFormat](./) avec les indicateurs de format et la langue spécifiés. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Constructeur de copie. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
