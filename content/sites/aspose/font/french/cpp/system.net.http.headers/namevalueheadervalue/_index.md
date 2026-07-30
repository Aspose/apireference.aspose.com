---
title: "Classe System::Net::Http::Headers::NameValueHeaderValue"
linktitle: "NameValueHeaderValue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Net::Http::Headers::NameValueHeaderValue. Représente une paire clé/valeur à utiliser dans les en‑têtes. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction System::MakeObject(). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument en C++."
type: docs
weight: 1400
url: /fr/cpp/system.net.http.headers/namevalueheadervalue/
---
## NameValueHeaderValue class


Représente une paire clé/valeur à utiliser dans les en‑têtes. Les objets de cette classe ne doivent être alloués qu’en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d’instance de ce type sur la pile ou avec l’opérateur new, car cela entraînera des erreurs d’exécution et/ou des échecs d’assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la transmettre aux fonctions en tant qu’argument.

```cpp
class NameValueHeaderValue : public virtual System::ICloneable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Compare les objets en utilisant la sémantique C# [Object.Equals](../../system/object/equals/). |
| static [Find](./find/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, String) | Trouve l’instance de la classe NameValueHeaderValue dans une collection selon le nom spécifié. |
| [get_Name](./get_name/)() | Renvoie le nom de l’instance courante. |
| [get_Value](./get_value/)() | Obtient la valeur de l’instance courante. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| static [GetHashCode](./gethashcode/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Renvoie le code de hachage de tous les éléments de la collection. |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [NameValueHeaderValue](./). |
| static [GetNameValueLength](./getnamevaluelength/)(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) | Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [NameValueHeaderValue](./). |
| static [GetNameValueListLength](./getnamevaluelistlength/)(String, int32_t, char16_t, System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>) | Convertit une chaîne passée à partir de l'index spécifié en la collection d'instances de la classe NameValueHeaderValue‑class et renvoie la longueur d'une sous‑chaîne analysée. |
| static [GetValueLength](./getvaluelength/)(String, int32_t) | Renvoie la longueur d'une valeur à partir de l'index spécifié. |
| [NameValueHeaderValue](./namevalueheadervalue/)() | Construit une nouvelle instance. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String) | Construit une nouvelle instance. |
| [NameValueHeaderValue](./namevalueheadervalue/)(String, String) | Construit une nouvelle instance. |
| static [Parse](./parse/)(String) | Convertit une chaîne passée en une instance de la classe [NameValueHeaderValue](./). |
| [set_Value](./set_value/)(String) | Définit une valeur de l'instance actuelle. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool, System::SharedPtr\<Text::StringBuilder\>) | Renvoie une représentation sous forme de chaîne de la collection d'instances de la classe NameValueHeaderValue‑class. |
| static [ToString](./tostring/)(System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\>, char16_t, bool) | Renvoie une représentation sous forme de chaîne de la collection d'instances de la classe NameValueHeaderValue‑class. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueHeaderValue\>\&) | Tente de convertir une chaîne passée en une instance de la classe [NameValueHeaderValue](./). |
## Voir aussi

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
