
def solveMaze(inp, x, y, m, n)
 
  if(inp[m][n] != 1)
   return 0
  end
 #Base condition
 if((x == m) && (y == n))
    return 1
  end
  # boundaries back off
  if ((x > m) || (y > m))
    return 0
  end
  if(inp[x][y] == 1)
    #move down
    return solveMaze(inp, x+1, y, m, n) + solveMaze(inp, x, y+1, m, n)
  else
    return 0
  end
end

n = gets.chomp.to_i
inp = Array.new(n)
for x in 0...n
  inp[x] = gets.chomp.split(" ").map(&:to_i)
end

sols = solveMaze(inp, 0, 0, n-1, n-1)

print "solutions #{sols}\n"
