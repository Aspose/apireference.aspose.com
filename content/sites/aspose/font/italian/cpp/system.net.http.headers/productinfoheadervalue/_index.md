---
title: "System::Net::Http::Headers::ProductInfoHeaderValue classe"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::ProductInfoHeaderValue classe. Rappresenta un prodotto o un commento in un valore dell'intestazione ''User-Agent''. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1800
url: /it/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


Rappresenta un prodotto o un commento in un valore dell'intestazione 'User-Agent'. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Confronta gli oggetti usando la semantica di C# [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Restituisce un commento. |
| [get_Product](./get_product/)() | Informazioni RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogo del metodo C# [Object.GetHashCode()](../../system/object/gethashcode/). Consente l'hashing di oggetti personalizzati. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Converte una stringa passata dall'indice specificato in un'istanza della classe [ProductInfoHeaderValue](./). |
| static [Parse](./parse/)(String) | Converte una stringa passata in un'istanza della classe [ProductInfoHeaderValue](./). |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Crea una nuova istanza. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Crea una nuova istanza. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Crea una nuova istanza. |
| [ToString](./tostring/)() const override | Analogo del metodo C# [Object.ToString()](../../system/object/tostring/). Consente la conversione di oggetti personalizzati in stringa. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Tenta di convertire una stringa passata in un'istanza della classe [ProductInfoHeaderValue](./). |
## Vedi anche

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
