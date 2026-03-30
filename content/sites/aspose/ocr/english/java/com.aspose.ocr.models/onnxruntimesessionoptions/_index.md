---
title: OnnxRuntimeSessionOptions
second_title: Aspose.OCR for Java API Reference
description: Configuration options for creating ONNX InferenceSession
type: docs
weight: 20
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
| [enableCpuMemArena](#enableCpuMemArena) | Enables or disables the CPU memory arena allocator used by ONNX Runtime. |
| [enableMemoryPattern](#enableMemoryPattern) | Enables or disables memory pattern optimization for input tensors. |
| [executionMode](#executionMode) | Execution mode for the session. |
| [graphOptimizationLevel](#graphOptimizationLevel) | Graph optimization level for the session. |
| [interOpNumThreads](#interOpNumThreads) | Number of threads for running multiple operations in parallel. |
| [intraOpNumThreads](#intraOpNumThreads) | Number of threads for a single operation. |


### OnnxRuntimeSessionOptions() {#OnnxRuntimeSessionOptions}
```
public OnnxRuntimeSessionOptions()
```


### enableCpuMemArena {#enableCpuMemArena}
```
public static boolean enableCpuMemArena
```


Enables or disables the CPU memory arena allocator used by ONNX Runtime. When enabled, memory is pooled and reused for better performance, but may lead to increased memory consumption in multi-threaded scenarios. Disable to reduce peak memory usage at the cost of performance.

### enableMemoryPattern {#enableMemoryPattern}
```
public static boolean enableMemoryPattern
```


Enables or disables memory pattern optimization for input tensors. When enabled, ONNX Runtime caches memory allocation patterns for faster execution, but may increase memory usage for dynamic input shapes. Disable if inputs vary significantly or to reduce memory footprint.

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