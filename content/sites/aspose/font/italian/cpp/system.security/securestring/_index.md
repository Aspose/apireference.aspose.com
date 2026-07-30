---
title: "System::Security::SecureString classe"
linktitle: "SecureString"
second_title: "Aspose.Font per C++"
description: "System::Security::SecureString classe. Secure string, rappresenta testo che dovrebbe rimanere confidenziale. Questa classe NON CRIPTA i dati interni. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.security/securestring/
---
## SecureString class


Secure string, rappresenta testo che dovrebbe rimanere confidenziale. Questa classe NON CRIPTA i dati interni. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SecureString : public System::IDisposable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AppendChar](./appendchar/)(char16_t) | Aggiunge un carattere alla fine della stringa. |
| [Clear](./clear/)() | Elimina tutti i caratteri dalla stringa sicura corrente. |
| [Copy](./copy/)() const | Crea un duplicato di questa stringa sicura. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate dall'oggetto corrente. |
| [get_Length](./get_length/)() const | Restituisce il numero di caratteri in questa stringa sicura. |
| [InsertAt](./insertat/)(int32_t, char16_t) | Inserisce un carattere all'indice specificato. |
| [IsReadOnly](./isreadonly/)() const | Restituisce il flag che indica se questo oggetto è contrassegnato come sola lettura. |
| [MakeReadOnly](./makereadonly/)() | Rende questa stringa sicura di sola lettura. |
| [operator=](./operator=/)(const SecureString\&) |  |
| [RemoveAt](./removeat/)(int32_t) | Rimuove il carattere nella posizione specificata. |
| [SecureString](./securestring/)() | Informazioni RTTI. |
| [SecureString](./securestring/)(const char16_t *, int32_t) | Costruttore. |
| [SecureString](./securestring/)(const SecureString\&) |  |
| [SetAt](./setat/)(int32_t, char16_t) | Sostituisce il carattere esistente nella posizione specificata. |
| [ToUnsecureString](./tounsecurestring/)() const | Copia il contenuto di questa stringa sicura in un oggetto [String](../../system/string/) non sicuro. Usare con cautela. |
| [~SecureString](./~securestring/)() | Distruttore. |
## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)
