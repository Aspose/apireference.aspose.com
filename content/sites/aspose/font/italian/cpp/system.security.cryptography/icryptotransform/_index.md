---
title: "System::Security::Cryptography::ICryptoTransform class"
linktitle: "ICryptoTransform"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ICryptoTransform class. Classe base del trasformatore crittografico. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2000
url: /it/cpp/system.security.cryptography/icryptotransform/
---
## ICryptoTransform class


Classe base del trasformatore crittografico. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class ICryptoTransform : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Dimensione del blocco di input. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Dimensione del blocco di output. |
| virtual [TransformBlock](./transformblock/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Informazioni RTTI. |
| virtual [TransformFinalBlock](./transformfinalblock/)(ArrayPtr\<uint8_t\>, int, int) | Elabora l'ultimo blocco di dati e calcola il valore di output. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
