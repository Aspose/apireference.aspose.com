---
title: "Classe System::EnumValues"
linktitle: "EnumValues"
second_title: "Aspose.Font pour C++"
description: "Classe System::EnumValues. Fournit des méta‑informations sur les constantes d’énumération du type d’énumération E en C++."
type: docs
weight: 2300
url: /fr/cpp/system/enumvalues/
---
## EnumValues class


Fournit des méta‑informations sur les constantes d'énumération du type d'énumération **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Paramètre | Description |
| --- | --- |
| E | Le type d’énumération |
## Méthodes

| Méthode | Description |
| --- | --- |
| [EnumValues](./enumvalues/)() | Construit une instance. |
| [GetNames](./getnames/)() const override | Renvoie un tableau contenant tous les noms de l’énumération **E**. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Récupère un tableau des noms des constantes d’une énumération spécifiée. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Renvoie le type sous‑jacent de l’énumération spécifiée. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Renvoie le type sous‑jacent de l’énumération spécifiée. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Renvoie la valeur empaquetée de la constante d’énumération avec le nom spécifié. |
| [GetValueOf](./getvalueof/)(long) const override | Renvoie la valeur empaquetée de la constante d’énumération avec la valeur spécifiée. |
| [GetValues](./getvalues/)() const override | Renvoie un tableau contenant toutes les valeurs de l’énumération **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Renvoie un tableau contenant toutes les valeurs du type d’énumération spécifié. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Renvoie un objet qui représente la valeur d’une constante d’énumération du type d’énumération spécifié avec le nom indiqué. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Convertit la valeur entière non signée 64 bits spécifiée en un membre d’énumération. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Convertit l’objet spécifié contenant une valeur entière en un membre d’énumération. |
| virtual [~EnumValues](./~enumvalues/)() | Destructeur. |

## Voir aussi

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
