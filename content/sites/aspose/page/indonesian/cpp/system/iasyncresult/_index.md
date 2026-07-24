---
title: "Kelas System::IAsyncResult"
linktitle: "IAsyncResult"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IAsyncResult. Mewakili status operasi asynchronous. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan error runtime dan/atau kegagalan assertion. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3100
url: /id/cpp/system/iasyncresult/
---
## IAsyncResult class


Mewakili status operasi asynchronous. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini pada stack atau menggunakan operator new, karena akan menyebabkan error runtime dan/atau kegagalan assertion. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class IAsyncResult : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | Mengembalikan objek yang berisi informasi tentang operasi asynchronous. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | Mengembalikan sebuah instance WaitHandle yang dapat digunakan untuk menunggu penyelesaian operasi asynchronous. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | Mengembalikan nilai yang menunjukkan apakah operasi asinkron selesai secara sinkron. |
| virtual [get_IsCompleted](./get_iscompleted/)() | Mengembalikan nilai yang menunjukkan apakah operasi asinkron telah selesai. |
| virtual [~IAsyncResult](./~iasyncresult/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [smart_ptr](./smart_ptr/) | Pointer bersama ke [IAsyncResult](./). |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
