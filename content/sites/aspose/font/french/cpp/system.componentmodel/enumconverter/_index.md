---
title: "classe System::ComponentModel::EnumConverter"
linktitle: "EnumConverter"
second_title: "Aspose.Font pour C++"
description: "classe System::ComponentModel::EnumConverter. Classe factice pour le code utilisant EnumConverter afin de compiler après traduction. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 700
url: /fr/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


Classe factice pour le code utilisant EnumConverter afin de compiler après traduction. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Vérifie si les types sont convertibles ; non implémenté. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | Vérifie si les types sont convertibles ; non implémenté. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | Effectue la conversion réelle de type ; non implémenté. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Effectue la conversion réelle de type ; non implémenté. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | Informations RTTI. |
| [get_EnumType](./get_enumtype/)() | Obtient le type d'énumération avec lequel [EnumConverter](./) travaille ; non implémenté. |
## Voir aussi

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
