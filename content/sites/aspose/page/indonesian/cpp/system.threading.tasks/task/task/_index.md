---
title: "System::Threading::Tasks::Task::Task constructor"
linktitle: "Task"
second_title: "Aspose.Page untuk C++"
description: "System::Threading::Tasks::Task::Task constructor. Konstruktor internal untuk membuat tugas yang belum diinisialisasi dalam C++."
type: docs
weight: 100
url: /id/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


Konstruktor internal untuk membuat tugas yang belum diinisialisasi.

```cpp
System::Threading::Tasks::Task::Task()
```

## Lihat Juga

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


Membuat sebuah [Task](../) dengan aksi berstatus dan objek status.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | Aksi yang akan dijalankan (menerima objek status) |
| state | const SharedPtr\<Object\>\& | Objek status yang didefinisikan pengguna yang diteruskan ke aksi |

## Lihat Juga

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


Membuat sebuah [Task](../) dengan aksi berstatus, status, dan token pembatalan.

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | Aksi yang akan dijalankan (menerima objek status) |
| state | const SharedPtr\<Object\>\& | Objek status yang didefinisikan pengguna yang diteruskan ke aksi |
| cancellationToken | const CancellationToken\& | Token untuk memantau permintaan pembatalan |

## Lihat Juga

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


Membuat sebuah [Task](../) dengan aksi untuk dijalankan.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| action | const Action<>\& | Aksi yang akan dijalankan secara asynchronous |

## Lihat Juga

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


Membuat sebuah [Task](../) dengan aksi dan token pembatalan.

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| action | const Action<>\& | Aksi yang akan dijalankan secara asynchronous |
| cancellationToken | const CancellationToken\& | Token untuk memantau permintaan pembatalan |

## Lihat Juga

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
