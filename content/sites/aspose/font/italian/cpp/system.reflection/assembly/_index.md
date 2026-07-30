---
title: "System::Reflection::Assembly classe"
linktitle: "Assembly"
second_title: "Aspose.Font per C++"
description: "System::Reflection::Assembly classe. Classe di riflessione che descrive l'assembly. Il supporto è limitato poiché le regole sono abbastanza diverse tra C# e C++. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Assembly](./assembly/)() | Costruttore. |
| virtual [get_CodeBase](./get_codebase/)() const | Ottiene la directory dell'assembly corrente. Il supporto è limitato. |
| virtual [get_FullName](./get_fullname/)() const | Ottiene il nome completo dell'assembly. |
| virtual [get_Location](./get_location/)() const | Ottiene la posizione dell'assembly. Non implementato. |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | Ottiene l'assembly che definisce il tipo specifico. |
| static [GetCallingAssembly](./getcallingassembly/)() | Ottiene l'assembly chiamante. |
| static [GetEntryAssembly](./getentryassembly/)() | Ottiene l'assembly di ingresso. |
| static [GetExecutingAssembly](./getexecutingassembly/)() | Ottiene l'assembly in esecuzione. |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | Ottiene i nomi delle risorse di manifest. |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | Ottiene lo stream collegato alla risorsa di manifest. |
| virtual [GetName](./getname/)() const | Ottiene il nome dell'assembly. |
| virtual [GetTypes](./gettypes/)() const | Ottiene i tipi dichiarati dall'assembly. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
