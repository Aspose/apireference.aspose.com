---
title: "Aspose::Page::IMultiPageDevice::OpenPage metodo"
linktitle: "OpenPage"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage metodo. Esegue la preparazione necessaria del dispositivo prima del rendering di ogni pagina in C++."
type: docs
weight: 400
url: /it/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Esegue la preparazione necessaria del dispositivo prima del rendering di ogni pagina.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| width | float | Una larghezza della pagina. |
| height | float | Un'altezza della pagina. |

### ReturnValue

Restituisce true se la pagina aperta ha un numero che rientra nell'intervallo di numeri di pagina selezionati, altrimenti false.

## Vedi anche

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Esegue la preparazione necessaria del dispositivo prima del rendering della pagina.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| titolo | System::String | Il titolo della pagina. |

### ReturnValue

True se la pagina proviene dall'intervallo richiesto, altrimenti false. Utilizzato nei dispositivi che possono renderizzare un array specificato di numeri di pagina.

## Vedi anche

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
