---
title: "Aspose::Page::EPS::Util::ThreadLocal classe"
linktitle: "ThreadLocal"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::Util::ThreadLocal classe. Classe usata per duplicare la funzionalità fornita dal tipo wrapper System.Threading.ThreadLocal del .NET Framework 4.0 e 4.5. Implementa tipi istanza e statici che sono locali al thread e si riferiscono a diverse istanze tra i thread, anche se il tipo di istanza reale di cui la classe è un aggregato potrebbe essere lo stesso in C++."
type: docs
weight: 100
url: /it/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Classe utilizzata per duplicare la funzionalità fornita dal tipo wrapper System.Threading.ThreadLocal del .NET Framework 4.0 e 4.5. Implementa tipi di istanza e statici che sono locali al thread e si riferiscono a istanze diverse tra i thread, anche se il tipo di istanza reale di cui la classe è un aggregato può essere lo stesso.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di variabile da avvolgere nella logica di selezione del thread |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() override | Non fa nulla. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del modello come puntatore debole (anziché condiviso). Consente di cambiare i puntatori nei contenitori in modalità debole. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Factory](./factory/) |  |

## Vedi anche

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
