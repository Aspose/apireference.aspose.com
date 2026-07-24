---
title: "Classe System::Threading::Tasks::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page per C++"
description: "Classe System::Threading::Tasks::ValueTask. Fornisce un risultato attendibile per un'operazione asincrona in C++."
type: docs
weight: 500
url: /it/cpp/system.threading.tasks/valuetask/
---
## ValueTask class


Fornisce un risultato attendibile di un'operazione asincrona.

```cpp
class ValueTask : public System::IEquatable<ValueTask>,
                  public System::Details::BoxableObjectBase
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AsTask](./astask/)() const | Converte questo [ValueTask](./) in un puntatore condiviso a [Task](../task/). |
| [ConfigureAwait](./configureawait/)(bool) const | Configura un awaiter per questo task. |
| [Equals](./equals/)(ValueTask) override | Determina se questa istanza è uguale a un'altra istanza di [ValueTask](./). |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina se questa istanza è uguale a un altro oggetto. |
| [get_IsCanceled](./get_iscanceled/)() const | Ottiene un valore che indica se il task è stato completato a causa di una cancellazione. |
| [get_IsCompleted](./get_iscompleted/)() const | Ottiene un valore che indica se il task è stato completato. |
| [get_IsCompletedSuccessfully](./get_iscompletedsuccessfully/)() const | Ottiene un valore che indica se il task è stato completato con successo. |
| [get_IsFaulted](./get_isfaulted/)() const | Ottiene un valore che indica se il task è stato completato a causa di un'eccezione non gestita. |
| [GetAwaiter](./getawaiter/)() const | Ottiene un awaiter per questo task per supportare le espressioni await. |
| [operator!=](./operator!=/)(const ValueTask\&) const | Operatore di disuguaglianza per [ValueTask](./). |
| [operator==](./operator==/)(const ValueTask\&) const | Operatore di uguaglianza per [ValueTask](./). |
| [ValueTask](./valuetask/)() | Crea un [ValueTask](./) vuoto e non inizializzato. |
| [ValueTask](./valuetask/)(const TaskPtr\&) | Crea un [ValueTask](./) da un puntatore condiviso a un [Task](../task/). |
## Vedi anche

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
