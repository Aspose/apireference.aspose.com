---
title: Add
second_title: Aspose.Tasks for .NET API リファレンス
description: 指定したタスクをインスタンスに追加しますTaskCollectionaspose.tasks/taskcollection/class. ParentProject.CalculationMode が None の場合ユーザーはこのメソッドを使用した後に Project.Recalculate を呼び出す必要があります すべてのプロジェクト タスクのスケジュールを変更し 開始日/終了日早い/遅い日付を設定スラックス作業などの依存フィールドを計算します ParentProject.CalculationMode が Manual の場合メソッドはタスク IDアウトライン レベルおよびアウトライン番号のみを自動的に計算します. ParentProject.CalculationMode が Automatic の場合メソッドはすべてのプロジェクトのタスクを自動的に再スケジュールします 開始/終了日付早い/遅い日付の設定スラック作業およびコスト フィールドの計算ID およびアウトライン レベルの再計算.
type: docs
weight: 50
url: /ja/net/aspose.tasks/taskcollection/add/
---
## Add(Task) {#add_4}

指定したタスクをインスタンスに追加します[`TaskCollection`](../)class. ParentProject.CalculationMode が None の場合、ユーザーはこのメソッドを使用した後に Project.Recalculate() を呼び出す必要があります (すべてのプロジェクト タスクのスケジュールを変更し (開始日/終了日、早い/遅い日付を設定)、スラックス、作業などの依存フィールドを計算します)。 ParentProject.CalculationMode が Manual の場合、メソッドはタスク ID、アウトライン レベル、およびアウトライン番号のみを自動的に計算します. ParentProject.CalculationMode が Automatic の場合、メソッドはすべてのプロジェクトのタスクを自動的に再スケジュールします (開始/終了日付、早い/遅い日付の設定、スラック、作業およびコスト フィールドの計算、ID およびアウトライン レベルの再計算).

```csharp
public void Add(Task item)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| item | Task | このタスク コレクションに追加する指定されたタスク。 |

### 関連項目

* class [Task](../../task/)
* class [TaskCollection](../)
* 名前空間 [Aspose.Tasks](../../taskcollection/)
* 組み立て [Aspose.Tasks](../../../)

---

## Add() {#add}

最後のタスクと同じアウトライン レベルのプロジェクト タスク コレクションに新しいタスクを追加します。

```csharp
public Task Add()
```

### 戻り値

の新しく追加されたインスタンスを返します[`Task`](../../task/)クラス。

### 関連項目

* class [Task](../../task/)
* class [TaskCollection](../)
* 名前空間 [Aspose.Tasks](../../taskcollection/)
* 組み立て [Aspose.Tasks](../../../)

---

## Add(string) {#add_2}

子タスク コレクションに新しいタスクを追加します。

```csharp
public Task Add(string taskName)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| taskName | String | 指定されたタスク名。 |

### 戻り値

の新しく追加されたインスタンスを返します[`Task`](../../task/)クラス。

### 関連項目

* class [Task](../../task/)
* class [TaskCollection](../)
* 名前空間 [Aspose.Tasks](../../taskcollection/)
* 組み立て [Aspose.Tasks](../../../)

---

## Add(string, int) {#add_3}

新しい繰り返しタスクを子タスク コレクションに追加します。

```csharp
public Task Add(string taskName, int beforeTaskId)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| taskName | String | 指定されたタスク名。 |
| beforeTaskId | Int32 | 新しいタスクが挿入される前のタスクの指定された ID。 |

### 戻り値

指定された ID を持つタスクの前に挿入されたタスクを返します。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentOutOfRangeException | 指定された ID が有効なタスク ID でない場合、ArgumentOutOfRangeException がスローされます。 |

### 関連項目

* class [Task](../../task/)
* class [TaskCollection](../)
* 名前空間 [Aspose.Tasks](../../taskcollection/)
* 組み立て [Aspose.Tasks](../../../)

---

## Add(RecurringTaskParameters) {#add_1}

指定された ID を持つ同じアウトライン レベルのタスクの前に新しいタスクを挿入します。

```csharp
public Task Add(RecurringTaskParameters parameters)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| parameters | RecurringTaskParameters | 定期的なタスクを作成するためのパラメーターを指定します。 |

### 戻り値

の新しく追加されたインスタンスを返します[`Task`](../../task/)クラス。

### 例外

| 例外 | 調子 |
| --- | --- |
| ArgumentNullException | 指定されたパラメーターが null の場合にスローされます。 |
| ArgumentException | 指定されたパラメーターが無効な場合にスローされます。 |

### 関連項目

* class [Task](../../task/)
* class [RecurringTaskParameters](../../recurringtaskparameters/)
* class [TaskCollection](../)
* 名前空間 [Aspose.Tasks](../../taskcollection/)
* 組み立て [Aspose.Tasks](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Tasks.dll -->
