---
title: "System::Threading::Semaphore::WaitOne‑metod"
linktitle: "WaitOne"
second_title: "Aspose.Page för C++"
description: "System::Threading::Semaphore::WaitOne‑metod. Låser semafor. Utför obegränsad väntan om nödvändigt i C++."
type: docs
weight: 500
url: /sv/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


Låser semafor. Utför obegränsad väntan om nödvändigt.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

Returnerar alltid true eftersom den inte returnerar förrän semafor är låst.

## Se även

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


Låser semafor. Utför väntan om nödvändigt.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| millisecondsTimeout | int | Väntetidsgräns i millisekunder. |

### ReturnValue

Returnerar true om semafor var låst eller false om tidsgränsen överskreds.

## Se även

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
