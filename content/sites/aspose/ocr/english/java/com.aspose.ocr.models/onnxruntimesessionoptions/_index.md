---
title: OnnxRuntimeSessionOptions
second_title: Aspose.OCR for Java API Reference
description: Configuration options for creating ONNX InferenceSession
type: docs
weight: 16
url: /java/com.aspose.ocr.models/onnxruntimesessionoptions/
---

**Inheritance:**
java.lang.Object
```
public class OnnxRuntimeSessionOptions
```

Configuration options for creating ONNX InferenceSession. We recommend keeping the optimized defaults unless you are absolutely certain about the modifications. For technical details, refer to ONNX Runtime documentation.
## Constructors

| Constructor | Description |
| --- | --- |
| [OnnxRuntimeSessionOptions()](#OnnxRuntimeSessionOptions) |  |
## Fields

| Field | Description |
| --- | --- |
| [executionMode](#executionMode) | Execution mode for the session. |
| [graphOptimizationLevel](#graphOptimizationLevel) | Graph optimization level for the session. |
| [interOpNumThreads](#interOpNumThreads) | Number of threads for running multiple operations in parallel. |
| [intraOpNumThreads](#intraOpNumThreads) | Number of threads for a single operation. |


### OnnxRuntimeSessionOptions() {#OnnxRuntimeSessionOptions}
```
public OnnxRuntimeSessionOptions()
```


### executionMode {#executionMode}
```
public static ExecutionModeOnnx executionMode
```


Execution mode for the session. By default, operators are executed concurrently, whenever possible.

### graphOptimizationLevel {#graphOptimizationLevel}
```
public static GraphOptimizationLevelOnnx graphOptimizationLevel
```


Graph optimization level for the session. By default, all available optimizations are enabled for maximum performance.

### interOpNumThreads {#interOpNumThreads}
```
public static int interOpNumThreads
```


Number of threads for running multiple operations in parallel. If sequential execution is enabled, this value is ignored.

### intraOpNumThreads {#intraOpNumThreads}
```
public static int intraOpNumThreads
```


Number of threads for a single operation.

