---
title: "System::Threading::WaitHandle::WaitOne método"
linktitle: "WaitOne"
second_title: "Aspose.Page para C++"
description: "System::Threading::WaitHandle::WaitOne método. Espera a que el manejador se active durante un período ilimitado en C++."
type: docs
weight: 600
url: /es/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


Espera a que el manejador se active indefinidamente.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Siempre devuelve verdadero ya que no ocurre tiempo de espera.

## Ver también

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


Espera a que el manejador se active.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) para esperar, en milisegundos; -1 significa espera infinita, 0 significa comprobar y devolver, los valores positivos son tiempos de espera. |

### ReturnValue

Verdadero si el manejador se activó, falso si se superó el tiempo de espera.

## Ver también

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Espera a que el manejador se active.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) para esperar, en milisegundos; -1 significa espera infinita, 0 significa comprobar y devolver, los valores positivos son tiempos de espera. |
| exitContext | bool | Si es verdadero, la espera debe liberar el bloqueo del manejador antes de esperar por él. |

### ReturnValue

Verdadero si el manejador se activó, falso si se superó el tiempo de espera.

## Ver también

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Espera a que el manejador se active.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) que representa el número de milisegundos a esperar, o un [System::TimeSpan](../../../system/timespan/) que representa -1 milisegundos para esperar indefinidamente. |

### ReturnValue

Verdadero si el manejador se activó, falso si se superó el tiempo de espera.

## Ver también

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
