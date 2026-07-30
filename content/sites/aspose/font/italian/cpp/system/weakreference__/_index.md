---
title: "Classe System::WeakReference<>"
linktitle: "WeakReference<>"
second_title: "Aspose.Font per C++"
description: "System::WeakReference<> class. Rappresenta un riferimento debole, che fa riferimento a un oggetto consentendo comunque che quell'oggetto venga eliminato in C++."
type: docs
weight: 7800
url: /it/cpp/system/weakreference__/
---
## WeakReference<> class


Rappresenta un riferimento debole, che fa riferimento a un oggetto consentendone comunque la cancellazione.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | Restituisce un'indicazione se l'oggetto referenziato dall'oggetto [WeakReference](../weakreference/) corrente è stato eliminato. |
| [get_Target](./get_target/)() const | Restituisce l'oggetto (il target) referenziato dall'oggetto [WeakReference](../weakreference/) corrente. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | Imposta l'oggetto (il target) referenziato dall'oggetto [WeakReference](../weakreference/) corrente. |
| [WeakReference](./weakreference/)() | Costruttore predefinito. |
| [WeakReference](./weakreference/)(std::nullptr_t) | Costruttore da nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | Inizializza una nuova istanza della classe [WeakReference](../weakreference/), referenziando l'oggetto specificato. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | Inizializza una nuova istanza della classe [WeakReference](../weakreference/), referenziando l'oggetto specificato. |
## Vedi anche

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
