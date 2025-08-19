def heightChecker(height):
    expected = sorted(height)
    mismatch = 0
    for h, e in zip(height, expected):
        if h != e:
            mismatch += 1
    return mismatch

if __name__ == "__main__":
    # User masukkan array di terminal
    raw_input = input("Masukkan array tinggi (pisahkan dengan spasi): ")
    height = list(map(int, raw_input.strip().split()))
    
    result = heightChecker(height)
    print("Jumlah siswa yang tidak sesuai urutan:", result)
