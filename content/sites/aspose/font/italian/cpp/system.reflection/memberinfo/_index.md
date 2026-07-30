---
title: "System::Reflection::MemberInfo classe"
linktitle: "MemberInfo"
second_title: "Aspose.Font per C++"
description: "System::Reflection::MemberInfo classe. Fornisce informazioni di riflessione sui membri. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 700
url: /it/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Fornisce informazioni di riflessione sui membri. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Aggiunge un attributo alla collezione. |
| [get_DeclaringType](./get_declaringtype/)() const | Ottiene il tipo dichiarante. |
| [get_FullName](./get_fullname/)() const | Ottiene il nome completo del membro. Può essere diverso nelle parti implementate manualmente. |
| virtual [get_MemberType](./get_membertype/)() const | Ottiene un valore [System::Reflection::MemberTypes](../membertypes/) che indica il tipo del membro - metodo, costruttore, evento, ecc. |
| [get_Name](./get_name/)() const | Ottiene il nome del membro. |
| [get_ReflectedType](./get_reflectedtype/)() const | Ottiene il tipo riflesso. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Restituisce un array contenente oggetti che rappresentano tutti gli attributi personalizzati applicati al tipo rappresentato dall'oggetto corrente. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Restituisce un array contenente oggetti che rappresentano tutti gli attributi personalizzati applicati al tipo rappresentato dall'oggetto corrente. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ObjectPtr](./objectptr/) | Alias per un puntatore condiviso a [Object](../../system/object/). |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
