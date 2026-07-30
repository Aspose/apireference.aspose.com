---
title: "System::Security::Cryptography::FromBase64Transform classe"
linktitle: "FromBase64Transform"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::FromBase64Transform classe. Converte l'istanza della classe CryptoStream da base 64. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1500
url: /it/cpp/system.security.cryptography/frombase64transform/
---
## FromBase64Transform class


Converte l'istanza della classe [CryptoStream](../cryptostream/) da base 64. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarla alle funzioni come argomento.

```cpp
class FromBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clear](./clear/)() | Rilascia tutte le risorse. |
| [Dispose](./dispose/)() | Rilascia le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [FromBase64Transform](./frombase64transform/)() | Costruttore. |
| [FromBase64Transform](./frombase64transform/)(FromBase64TransformMode) | Costruttore. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Restituisce un valore che indica se la trasformazione corrente può essere riutilizzata. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Restituisce un valore che indica se più blocchi possono essere trasformati. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Dimensione del blocco di input. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Dimensione del blocco di output. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) |  |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) |  |
| virtual [~FromBase64Transform](./~frombase64transform/)() | Distruttore. |
## Vedi anche

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
