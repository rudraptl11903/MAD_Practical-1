class Matrix(
    val rows: Int,
    val cols: Int,
    val data: Array<IntArray>
) {

    // Matrix Addition
    operator fun plus(other: Matrix): Matrix {

        if (this.rows != other.rows || this.cols != other.cols) {
            throw IllegalArgumentException("Matrix dimensions must match!")
        }

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] =
                    this.data[i][j] + other.data[i][j]
            }
        }

        return Matrix(rows, cols, result)
    }

    // Matrix Subtraction
    operator fun minus(other: Matrix): Matrix {

        if (this.rows != other.rows || this.cols != other.cols) {
            throw IllegalArgumentException("Matrix dimensions must match!")
        }

        val result = Array(rows) { IntArray(cols) }

        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] =
                    this.data[i][j] - other.data[i][j]
            }
        }

        return Matrix(rows, cols, result)
    }

    // Matrix Multiplication
    operator fun times(other: Matrix): Matrix {

        if (this.cols != other.rows) {
            throw IllegalArgumentException("Cannot multiply matrices!")
        }

        val result = Array(this.rows) {
            IntArray(other.cols)
        }

        for (i in 0 until this.rows) {
            for (j in 0 until other.cols) {

                var sum = 0

                for (k in 0 until this.cols) {
                    sum += this.data[i][k] * other.data[k][j]
                }

                result[i][j] = sum
            }
        }

        return Matrix(this.rows, other.cols, result)
    }

    // Display Matrix
    override fun toString(): String {

        val sb = StringBuilder()

        for (i in 0 until rows) {
            for (j in 0 until cols) {

                sb.append(data[i][j])

                if (j < cols - 1) {
                    sb.append("  ")
                }
            }

            sb.append("\n")
        }

        return sb.toString()
    }
}

fun main() {

    // =====================================================
    // MATRIX ADDITION
    // =====================================================

    println("*".repeat(20) + " Addition " + "*".repeat(20))

    val firstMatrix = Matrix(
        rows = 3,
        cols = 2,
        data = arrayOf(
            intArrayOf(0, 5),
            intArrayOf(9, 0),
            intArrayOf(5, 4)
        )
    )

    val secondMatrix = Matrix(
        rows = 3,
        cols = 2,
        data = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        )
    )

    println("Matrix 1 (3 x 2):")
    print(firstMatrix)

    println("Matrix 2 (3 x 2):")
    print(secondMatrix)

    val additionResult = firstMatrix + secondMatrix

    println("Addition Result:")
    print(additionResult)


    // =====================================================
    // MATRIX SUBTRACTION
    // =====================================================

    println("*".repeat(20) + " Subtraction " + "*".repeat(20))

    println("Matrix 1 (3 x 2):")
    print(firstMatrix)

    println("Matrix 2 (3 x 2):")
    print(secondMatrix)

    val subtractionResult = firstMatrix - secondMatrix

    println("Subtraction Result:")
    print(subtractionResult)


    // =====================================================
    // MATRIX MULTIPLICATION
    // =====================================================

    println("*".repeat(20) + " Multiplication " + "*".repeat(20))

    val multiplyMatrix1 = Matrix(
        rows = 2,
        cols = 3,
        data = arrayOf(
            intArrayOf(3, -2, 5),
            intArrayOf(1, 0, 0)
        )
    )

    val multiplyMatrix2 = Matrix(
        rows = 3,
        cols = 2,
        data = arrayOf(
            intArrayOf(2, 3),
            intArrayOf(-9, 0),
            intArrayOf(0, 4)
        )
    )

    println("Matrix 1 (2 x 3):")
    print(multiplyMatrix1)

    println("Matrix 2 (3 x 2):")
    print(multiplyMatrix2)

    val multiplicationResult =
        multiplyMatrix1 * multiplyMatrix2

    println("Multiplication Result (2 x 2):")
    print(multiplicationResult)
}