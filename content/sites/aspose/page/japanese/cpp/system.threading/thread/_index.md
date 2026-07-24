---
title: "System::Threading::Thread クラス"
linktitle: "スレッド"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Thread クラス。スレッドの実装。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ の関数に引数として渡す際はそのポインタを使用してください。"
type: docs
weight: 1200
url: /ja/cpp/system.threading/thread/
---
## Thread class


[Thread](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Thread : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Abort](./abort/)() | スレッドを中止します。実装されていません。 |
| [get_CurrentCulture](./get_currentculture/)() | スレッドのカルチャを取得します。 |
| static [get_CurrentThread](./get_currentthread/)() | 現在のスレッドを記述するオブジェクトを取得します。 |
| [get_CurrentUICulture](./get_currentuiculture/)() | スレッドで使用されるユーザーインターフェイスのカルチャを取得します。 |
| [get_IsAlive](./get_isalive/)() | スレッドが存続しているかどうかを確認します。 |
| [get_IsBackground](./get_isbackground/)() | スレッドがバックグラウンドかどうかを確認します。 |
| [get_IsThreadPoolThread](./get_isthreadpoolthread/)() | スレッドがスレッドプールに所属しているかどうかを確認します。 |
| [get_ManagedThreadId](./get_managedthreadid/)() const | スレッドの識別子を取得します。OS から取得可能ですが、OS のスレッド識別子が int の上限を超える場合、スレッドの ID が衝突する可能性があります。 |
| [get_Name](./get_name/)() | スレッド名を取得します。 |
| [get_ThreadState](./get_threadstate/)() | スレッドの状態を取得します。 |
| static [GetCurrentThreadId](./getcurrentthreadid/)() | 現在のスレッドの識別子を取得します。 |
| [GetHashCode](./gethashcode/)() const override |  |
| [Interrupt](./interrupt/)() | スレッドを割り込みます。実装されていません。 |
| [Join](./join/)() | 管理対象スレッドに参加します。必要に応じて無制限の待機を行います。 |
| [Join](./join/)(int) | 管理対象スレッドに参加します。制限付きの待機を行います。 |
| [Join](./join/)(TimeSpan) | 管理対象スレッドに参加します。制限付きの待機を行います。 |
| static [MemoryBarrier](./memorybarrier/)() | メモリアクセスを同期します。 |
| [operator=](./operator=/)(const Thread\&) | 別のスレッドから TLS データをコピーします。 |
| [set_CurrentCulture](./set_currentculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | スレッドのカルチャを設定します。 |
| [set_CurrentUICulture](./set_currentuiculture/)(const SharedPtr\<Globalization::CultureInfo\>\&) | スレッドで使用されるユーザーインターフェイスのカルチャを設定します。 |
| [set_IsBackground](./set_isbackground/)(bool) | スレッドをバックグラウンドまたはフォアグラウンドに設定します。 |
| [set_Name](./set_name/)(const System::String\&) | スレッド名を設定します。 |
| static [Sleep](./sleep/)(int) | 指定されたタイムアウトで現在のスレッドを停止します。 |
| static [Sleep](./sleep/)(TimeSpan) | 指定されたタイムアウトで現在のスレッドを停止します。 |
| static [SpinWait](./spinwait/)(int) | 特定のループ反復回数を待機します。 |
| [Start](./start/)() | null 引数オブジェクトを使用してスレッドを開始します。 |
| [Start](./start/)(const System::SharedPtr\<System::Object\>\&) | スレッドを開始します。 |
| [Thread](./thread/)() | コンストラクタ。 |
| [Thread](./thread/)(ThreadStart) | コンストラクタ。 |
| [Thread](./thread/)(ParameterizedThreadStart) | コンストラクタ。 |
| [Thread](./thread/)(Thread\&) | コピーコンストラクタ。 |
| static [Yield](./yield/)() | スレッドを譲渡します。 |
| virtual [~Thread](./~thread/)() | デストラクタ。 |
## 備考



```cpp
#include "system/threading/thread.h"
#include "system/smart_ptr.h"

int main()
{
  auto thread = System::MakeObject<System::Threading::Thread>([]()
  {
    std::cout << "Child thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;
    System::Threading::Thread::Sleep(200);
  });

  std::cout << "Main thread ID: " << System::Threading::Thread::GetCurrentThreadId() << std::endl;

  thread->Start();
  thread->Join();

  return 0;
}
/*
This code example produces the following output:
Main thread ID: 2
Child thread ID: 1
*/
```

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
