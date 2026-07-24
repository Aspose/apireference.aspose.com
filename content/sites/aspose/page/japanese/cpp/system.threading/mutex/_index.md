---
title: "System::Threading::Mutex クラス"
linktitle: "Mutex"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Mutex クラス。Mutex の実装です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system.threading/mutex/
---
## Mutex class


[Mutex](./) implemnetation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Mutex : public System::Threading::WaitHandle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Mutex](./mutex/)() | RTTI 情報。 |
| [Mutex](./mutex/)(bool) | コンストラクタ。 |
| [Mutex](./mutex/)(bool, const String\&) | コンストラクタ。 |
| [ReleaseMutex](./releasemutex/)() | ミューテックスを解放します。 |
| static [Remove](./remove/)(const String\&) | システムから名前付きミューテックスを削除します。 |
| virtual [Reset](./reset/)() | ミューテックスの状態をリセットします。実装されていません。 |
| virtual [Set](./set/)() | ミューテックスをシグナル状態に設定します。実装されていません。 |
| [WaitOne](./waitone/)() override | ミューテックスをロックします。必要に応じて無制限に待機します。 |
| [WaitOne](./waitone/)(int) override | ミューテックスをロックします。必要に応じて待機します。 |
| [WaitOne](./waitone/)(TimeSpan) override | ミューテックスをロックします。必要に応じて待機します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | タイムアウトが超過し何もシグナルが来なかった場合、配列中のシグナルオブジェクトのインデックスを返す代わりに関数が返す特別な値。 |
## 備考



```cpp
#include "system/threading/mutex.h"
#include "system/threading/thread.h"
#include "system/console.h"
#include "system/convert.h"
#include "system/smart_ptr.h"
#include "system/string.h"

int main()
{
  auto mutex = System::MakeObject<System::Threading::Mutex>();

  System::String str;

  const int THREADS_COUNT = 3;
  std::vector<System::SharedPtr<System::Threading::Thread>> threads;
  threads.reserve(THREADS_COUNT);

  for (auto i = 0; i < THREADS_COUNT; ++i)
  {
    threads.push_back(System::MakeObject<System::Threading::Thread>([&mutex, &str]()
    {
      mutex->WaitOne();

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" started." + System::Environment::get_NewLine();

      System::Threading::Thread::Sleep(200);

      str += u"Thread " + System::Convert::ToString(System::Threading::Thread::GetCurrentThreadId()) + u" ended." + System::Environment::get_NewLine();

      mutex->ReleaseMutex();
    }));

    threads[i]->Start();
  }

  System::Threading::Thread::Sleep(700);

  System::Console::WriteLine(str);

  return 0;
}
/*
This code example produces the following output:
Thread 1 started.
Thread 1 ended.
Thread 2 started.
Thread 2 ended.
Thread 3 started.
Thread 3 ended.
*/
```

## 参照

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
