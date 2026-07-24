---
title: "System::Threading::Mutex::WaitOne método"
linktitle: "WaitOne"
second_title: "Aspose.Page para C++"
description: "System::Threading::Mutex::WaitOne método. Bloquea el mutex. Realiza una espera ilimitada si es necesario en C++."
type: docs
weight: 500
url: /es/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Bloquea el mutex. Realiza una espera ilimitada si es necesario.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Siempre devuelve true ya que no regresa hasta que el mutex esté bloqueado.

## Ver también

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Bloquea el mutex. Realiza una espera si es necesario.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| millisecondsTimeout | int | Tiempo de espera en milisegundos. |

### ReturnValue

Devuelve true si el mutex estaba bloqueado o false si se superó el tiempo de espera.

## Ver también

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Bloquea el mutex. Realiza una espera si es necesario.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) que representa el número de milisegundos a esperar, o un [System::TimeSpan](../../../system/timespan/) que representa -1 milisegundos para esperar indefinidamente. |

### ReturnValue

Devuelve true si el mutex estaba bloqueado o false si se superó el tiempo de espera.

## Ver también

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
