function heightChecker(height) {
  let expected = [...height].sort((a, b) => a - b);
  let mismatch = 0;
  for (let i = 0; i < height.length; i++) {
    if (height[i] !== expected[i]) {
      mismatch++;
    }
  }
  return mismatch;
}

// --- Input dari terminal ---
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question("Masukkan array tinggi (pisahkan dengan spasi): ", (answer) => {
  let height = answer.trim().split(/\s+/).map(Number);
  let result = heightChecker(height);
  console.log("Jumlah siswa yang tidak sesuai urutan:", result);
  rl.close();
});
