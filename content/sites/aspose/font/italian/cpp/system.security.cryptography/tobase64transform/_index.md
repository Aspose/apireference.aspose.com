---
title: "System::Security::Cryptography::ToBase64Transform classe"
linktitle: "ToBase64Transform"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ToBase64Transform classe. Converte l'istanza della classe CryptoStream in base 64. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operator new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 5000
url: /it/cpp/system.security.cryptography/tobase64transform/
---
## ToBase64Transform class


Converte l'istanza della classe [CryptoStream](../cryptostream/) in base 64. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando operator new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class ToBase64Transform : public System::Security::Cryptography::ICryptoTransform
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clear](./clear/)() | Rilascia tutte le risorse. |
| [Dispose](./dispose/)() | Rilascia le risorse del sistema operativo acquisite dall'oggetto corrente. |
| virtual [get_CanReuseTransform](./get_canreusetransform/)() | Restituisce un valore che indica se la trasformazione corrente può essere riutilizzata. |
| [get_CanTransformMultipleBlocks](./get_cantransformmultipleblocks/)() | Restituisce un valore che indica se più blocchi possono essere trasformati. |
| virtual [get_InputBlockSize](./get_inputblocksize/)() | Dimensione del blocco di input. |
| virtual [get_OutputBlockSize](./get_outputblocksize/)() | Dimensione del blocco di output. |
| [TransformBlock](./transformblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, System::ArrayPtr\<uint8_t\>, int32_t) | Elabora un blocco di dati e copia i dati nell'array di output. |
| [TransformFinalBlock](./transformfinalblock/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | Elabora l'ultimo blocco di dati e calcola il valore di output. |
| virtual [~ToBase64Transform](./~tobase64transform/)() | Distruttore. |
## Vedi anche

* Class [ICryptoTransform](../icryptotransform/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
