---
title: "Clase Aspose::Page::EPS::Util::ThreadLocal"
linktitle: "ThreadLocal"
second_title: "Aspose.Page para C++"
description: "Clase Aspose::Page::EPS::Util::ThreadLocal. Clase utilizada para duplicar la funcionalidad proporcionada por el tipo contenedor System.Threading.ThreadLocal del .NET Framework 4.0 y 4.5''. Implementa tipos de instancia y estáticos que son locales a cada hilo y se refieren a diferentes instancias entre hilos, aunque el tipo de instancia real del que la clase es un agregado pueda ser el mismo en C++."
type: docs
weight: 100
url: /es/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Clase utilizada para duplicar la funcionalidad proporcionada por el tipo contenedor System.Threading.ThreadLocal del .NET Framework 4.0 y 4.5. Implementa tipos de instancia y estáticos que son locales a cada hilo y se refieren a diferentes instancias entre hilos, aunque el tipo de instancia real del que la clase es un agregado pueda ser el mismo.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Parámetro | Descripción |
| --- | --- |
| T | Tipo de variable para envolver en la lógica de selección de hilos. |
## Métodos

| Método | Descripción |
| --- | --- |
| [Dispose](./dispose/)() override | No hace nada. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Establece el n‑ésimo argumento de plantilla como un puntero débil (en lugar de compartido). Permite cambiar los punteros en contenedores al modo débil. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Descripción |
| --- | --- |
| [Factory](./factory/) |  |

## Ver también

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
